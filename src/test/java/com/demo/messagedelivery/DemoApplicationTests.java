package com.demo.messagedelivery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Messages;
import com.demo.services.MessageService;


@SpringBootTest class DemoApplicationTests {
  
@Autowired
private  MessageService messageService;
  @Test
  void savedMessage() {
    Messages msgs = new Messages();
    msgs.setMessagename("TestMsg");
    msgs.setDeliveryTime(new Date());
    Messages msg=messageService.saveMessage(msgs);
   assertNotNull(msg);
  }
 
}