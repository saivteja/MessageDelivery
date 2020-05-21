package com.demo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Messages;
import com.demo.repos.MessageRepository;

@Service
public class MessageService {
	@Autowired
	MessageRepository messageRepository;
	
	public List<Messages> getMessageToBeDisplayed() throws ParseException{
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    sdfDate.setTimeZone(TimeZone.getTimeZone("UTC"));
	    String strDateEnd = sdfDate.format(now);
	   Date prev= new Date(System.currentTimeMillis() - 60000);
	    String strDateStart=sdfDate.format(prev);	    
		return new ArrayList<>(messageRepository.findMessageTobeDisplayed(strDateStart,strDateEnd));
		
	}
	
	public List<Messages> getAlMessages(){
		return messageRepository.findAll();
		
	}
	
	public Messages saveMessage(Messages msg) {
		return messageRepository.save(msg);
	}
	

}
