package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.exception.CamelCustomException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Component
public class MyProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println(exchange.getIn().getBody());
		FulfillmentOutcomeManagerBean body = exchange.getIn().getBody(FulfillmentOutcomeManagerBean.class);
		//ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//FulfillmentOutcomeManagerBean bean = mapper.readValue(body, FulfillmentOutcomeManagerBean.class);
		System.out.println(body);
	//	exchange.getIn().setBody(bean);
		exchange.getIn().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(body);
		System.out.println("converted to json :" +json);
		exchange.getIn().setBody(json);;
		//exchange.getIn().setHeader("Content-Type", "application/json");
	}

}
