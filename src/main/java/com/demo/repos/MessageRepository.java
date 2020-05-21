package com.demo.repos;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Messages;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Integer> {

	@Query(value="SELECT m.id,m.messagename,m.deliveryTime FROM Messages m where m.deliveryTime <=:msgDeliveryTimeEnd AND  m.deliveryTime >:msgDeliveryTimeStart",
			nativeQuery=true)
	Collection<Messages> findMessageTobeDisplayed(
			 @Param("msgDeliveryTimeStart") String msgDeliveryTimeStart,
			 @Param("msgDeliveryTimeEnd") String msgDeliveryTimeEnd);
	
}
