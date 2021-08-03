package com.example.controller;


public class FulfillmentSubDocument {
	private Fulfillment fulfillment;

	public Fulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

	@Override
	public String toString() {
		return "FulfillmentSubDocument [fulfillment=" + fulfillment + "]";
	}
	
	
}
