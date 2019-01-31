import java.util.Date;

/**
 * [调度类]
 *
 * @author Tony
 * @date 2019-1-31
 * @copyright copyright (c) 2019
 */

public class QuartzSimple {
    public static void main(String[] args) {
        //简单任务调度，每隔多少时间执行一次，执行n次
        //SchedulerUtil.handleSimpleTrigger("简单调度", "测试组", "触发器名字", "触发器组名字", MyJob.class, 1, 8);
        //复杂调度，每天的什么时候执行任务
        SchedulerUtil.hadleCronTrigger("复杂调度", "测试组", "触发器名字", "触发器组名字", MyJob.class, "0 */1 * * * ?");
    }
}