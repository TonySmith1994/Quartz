import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * [任务类]
 * @author Tony
 * @date 2019-01-31
 * @copyright copyright (c) 2019
 */
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("Hello World"+new Date());

    }
}