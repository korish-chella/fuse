package com.example.controller;

public class ApiRequest {

	private String mdn;
	private String customerId;
	private String newBillingOfferCaption;
	private String compId;
	private String storeId;
	private String interactionID;
	private String sourceApplication;
	
	public String getMdn() {
		return mdn;
	}
	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getNewBillingOfferCaption() {
		return newBillingOfferCaption;
	}
	public void setNewBillingOfferCaption(String newBillingOfferCaption) {
		this.newBillingOfferCaption = newBillingOfferCaption;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getInteractionID() {
		return interactionID;
	}
	public void setInteractionID(String interactionID) {
		this.interactionID = interactionID;
	}
	public String getSourceApplication() {
		return sourceApplication;
	}
	public void setSourceApplication(String sourceApplication) {
		this.sourceApplication = sourceApplication;
	}
	@Override
	public String toString() {
		return "ApiRequest [mdn=" + mdn + ", customerId=" + customerId + ", newBillingOfferCaption="
				+ newBillingOfferCaption + ", compId=" + compId + ", storeId=" + storeId + ", interactionID="
				+ interactionID + ", sourceApplication=" + sourceApplication + "]";
	}
	
}
