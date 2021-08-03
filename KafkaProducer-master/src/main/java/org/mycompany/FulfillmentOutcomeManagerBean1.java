package org.mycompany;

public class FulfillmentOutcomeManagerBean1 {
	
	private String errorType;
	private String errorDetails;
	private FulfillmentOutcomeManagerBean originalMessage;
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	public FulfillmentOutcomeManagerBean getOriginalMessage() {
		return originalMessage;
	}
	public void setOriginalMessage(FulfillmentOutcomeManagerBean originalMessage) {
		this.originalMessage = originalMessage;
	}
	@Override
	public String toString() {
		return "FulfillmentOutcomeManagerBean1 [errorType=" + errorType + ", errorDetails=" + errorDetails
				+ ", originalMessage=" + originalMessage + "]";
	}
	
	

}
