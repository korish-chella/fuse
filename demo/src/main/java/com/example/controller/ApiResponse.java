package com.example.controller;

public class ApiResponse {
	private TrackingInfo trackingInfo;
	
	private Response response;

	public TrackingInfo getTrackingInfo() {
		return trackingInfo;
	}

	public void setTrackingInfo(TrackingInfo trackingInfo) {
		this.trackingInfo = trackingInfo;
	}
	
	
	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ApiResponse [trackingInfo=" + trackingInfo + ", response=" + response + "]";
	}

}

class Response{
	
	private String responseCode;
	private String responseDescription;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	@Override
	public String toString() {
		return "Response [responseCode=" + responseCode + ", responseDescription=" + responseDescription + "]";
	}
	
}

class OrderDetails{
	
	private String orderID;
	private String orderActionID;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderActionID() {
		return orderActionID;
	}
	public void setOrderActionID(String orderActionID) {
		this.orderActionID = orderActionID;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderID=" + orderID + ", orderActionID=" + orderActionID + "]";
	}
	
}