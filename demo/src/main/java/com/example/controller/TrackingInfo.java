package com.example.controller;

public class TrackingInfo {
			
	private String trackingId;
	private String requestTimestamp;
	private String responseTimestamp;
	public String getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}
	public String getRequestTimestamp() {
		return requestTimestamp;
	}
	public void setRequestTimestamp(String requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
	}
	public String getResponseTimestamp() {
		return responseTimestamp;
	}
	public void setResponseTimestamp(String responseTimestamp) {
		this.responseTimestamp = responseTimestamp;
	}
	@Override
	public String toString() {
		return "TrackingInfo [trackingId=" + trackingId + ", requestTimestamp=" + requestTimestamp
				+ ", responseTimestamp=" + responseTimestamp + "]";
	}
    	 
}
