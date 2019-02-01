import org.quartz.Job;

/**
 * [调度类]
 *
 * @author Tony
 * @date 2019-1-31
 * @copyright copyright (c) 2019
 */

public class QuartzSimple {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //简单任务调度，每隔多少时间执行一次，执行n次
        //SchedulerUtil.handleSimpleTrigger("简单调度", "测试组", "触发器名字", "触发器组名字", MyJob.class, 1, 8);
        //复杂调度，每天的什么时候执行任务
        //SchedulerUtil.hadleCronTrigger("复杂调度", "测试组", "触发器名字", "触发器组名字", MyJob.class, "0 */1 * * * ?");
        QuartzManager quartzManager = new QuartzManager();
        Job job = (Job) Class.forName("MyJob").newInstance();
        //添加一个任务
        quartzManager.addJob("任务一", "组一", "触发器名字", "触发器组名", job.getClass(), "0/1 * * * * ?");
        //开始所有任务
        quartzManager.startJobs();
        //睡眠
        Thread.sleep(1000);
        //关闭所有任务
        quartzManager.shutdownJobs();
    }
}