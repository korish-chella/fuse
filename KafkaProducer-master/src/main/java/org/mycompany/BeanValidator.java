package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

public class BeanValidator{

	/*
	 * @Override public void configure() throws Exception { // Set up a JSON format
	 * so we can unmarshal to a POJO JsonDataFormat json = new
	 * JsonDataFormat(JsonLibrary.Jackson);
	 * 
	 * // Set the target class that I want to convert the JSON to
	 * json.setUnmarshalType(FulfillmentOutcomeManagerBean.class);
	 * 
	 * // Read a JSON file from("file:D:\\learning\\pocs\\fuse\\files")
	 * 
	 * // convert to a Java object .unmarshal(json)
	 * 
	 * // Validate the Java object .to("bean-validator:myvalidator")
	 * 
	 * .to("mock:output").end();
	 * 
	 * }
	 */

}
