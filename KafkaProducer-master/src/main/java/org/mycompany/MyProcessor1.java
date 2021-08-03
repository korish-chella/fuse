package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MyProcessor1 implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody());
		String body = exchange.getIn().getBody(String.class);
		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		FulfillmentOutcomeManagerBean1 bean = mapper.readValue(body, FulfillmentOutcomeManagerBean1.class);
		System.out.println("error Bean:"+bean);
	}

}
