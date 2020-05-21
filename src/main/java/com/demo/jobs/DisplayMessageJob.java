package com.demo.jobs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entities.Messages;
import com.demo.services.MessageService;

@Component
public class DisplayMessageJob implements Job {

	@Autowired
	MessageService messageService;
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		List<Messages> messageList= new ArrayList<Messages>();
		try {
			messageList = messageService.getMessageToBeDisplayed();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Messages msgs: messageList) {
			System.out.println(msgs.getMessagename() +" delivered ");
		}
	}

}
