package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class ServerExceptionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		exchange.getIn().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);
		exchange.getIn().setBody(new CustomException("500","INTERNAL_SERVER_ERROR",body));
		System.out.println("in exception handler :"+body);
	}

}
