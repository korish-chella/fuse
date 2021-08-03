package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Component
public class ExceptionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		FulfillmentOutcomeManagerBean body = exchange.getIn().getBody(FulfillmentOutcomeManagerBean.class);
		exchange.getIn().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(body);
		//exchange.getException().getMessage();
		exchange.getIn().setBody(new CustomException("400","BAD_REQUEST",json));
		System.out.println("in exception handler :"+body);
	}

}
