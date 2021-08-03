package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FulFillmentValidatorProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody());
		String body = exchange.getIn().getBody(String.class);
		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		FulfillmentOutcomeManagerBean bean = mapper.readValue(body, FulfillmentOutcomeManagerBean.class);
		System.out.println(bean);
		exchange.getIn().setBody(bean);
	}

}
