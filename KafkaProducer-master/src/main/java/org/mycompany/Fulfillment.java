package org.mycompany;

public class Fulfillment {
	
	private String type;
	private ApiRequest apiRequest;
	private ApiResponse apiResponse;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ApiRequest getApiRequest() {
		return apiRequest;
	}
	public void setApiRequest(ApiRequest apiRequest) {
		this.apiRequest = apiRequest;
	}
	public ApiResponse getApiResponse() {
		return apiResponse;
	}
	public void setApiResponse(ApiResponse apiResponse) {
		this.apiResponse = apiResponse;
	}
	@Override
	public String toString() {
		return "Fulfillment [type=" + type + ", apiRequest=" + apiRequest + ", apiResponse=" + apiResponse + "]";
	}
	
	
}
