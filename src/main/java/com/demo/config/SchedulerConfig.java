package com.demo.config;


import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import com.demo.jobs.DisplayMessageJob;

@Configuration
public class SchedulerConfig {
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob().ofType(DisplayMessageJob.class)
          .storeDurably()
          .withIdentity("Qrtz_Job_Detail")  
          .withDescription("Message Job Service")
          .build();
    }
    
    @Bean
    public SimpleTriggerFactoryBean trigger(JobDetail job) {
    	System.out.println(job.getDescription()+"********");
        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
        trigger.setJobDetail(job);
        trigger.setRepeatInterval(60000);
        trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        return trigger;
    }
    
   

}
