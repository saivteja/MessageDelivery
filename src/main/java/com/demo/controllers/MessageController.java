package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Messages;
import com.demo.services.MessageService;

@RestController
public class MessageController {
	@Autowired
	private  MessageService messageService;

	/*
	 * MessageController(MessageRepository repository) { this.repository =
	 * repository; }
	 */
	
	/**
	 * Inserts a message with mesagedeliverytime.
	 *
	 * @return List of all messages .
	 */
	@GetMapping("/messages")
	public List<Messages> greeting() {
		return messageService.getAlMessages();
	}
	
	/**
	 * Inserts a message with mesagedeliverytime.
	 * 
	 * @return Httpstatus with a message.
	 */
	
	@PostMapping("/messages")
	public ResponseEntity<String> newEmployee(@RequestBody Messages newMessage) {
		System.out.println(newMessage.getDeliveryTime());
		try {
			messageService.saveMessage(newMessage);
		    return new ResponseEntity<>("Delivery time recorded successfully",HttpStatus.ACCEPTED);
		} catch (Exception e) {
		    return new ResponseEntity<>("An error occurred. Please try later",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    
	  }
}