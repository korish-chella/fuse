package org.mycompany.exception;

public class CamelCustomException extends Exception{

	private static final long serialVersionUID = -1830941144058122372L;
	
	private String errorType;
	private String errorDetails;
	private String originalMessage;
	
	public CamelCustomException() {
		super();
	}

	public CamelCustomException(String errorType, String errorDetails, String originalMessage) {
		super();
		this.errorType = errorType;
		this.errorDetails = errorDetails;
		this.originalMessage = originalMessage;
	}

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

	public String getOriginalMessage() {
		return originalMessage;
	}

	public void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}

	@Override
	public String toString() {
		return "{\n \"errorType\":\"" + errorType + "\",\n \"errorDetails\":\"" + errorDetails + "\",\n \"originalMessage\":"
				+ originalMessage + "\n}";
	}
	
}
