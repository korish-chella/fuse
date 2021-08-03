package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class KafkaConsumerRoute extends RouteBuilder{
	
	/*
	 * @Autowired GetFulfillmentOutcomeManagerBean fulfillment;
	 */

	@Override
	public void configure() throws Exception {
		  from("kafka:{{kafka.topic}}?brokers=localhost:9092")
		                  .log("${body}");
		
	}

}


/*
 * @Component class GetFulfillmentOutcomeManagerBean{ Logger logger=
 * LoggerFactory.getLogger(Object.class); public void getData(Object bean){
 * logger.info("Emp data: "+bean.toString()); } }
 */