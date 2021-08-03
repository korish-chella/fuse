package org.mycompany;

import javax.validation.constraints.NotBlank;

public class FulfillmentOutcomeManagerBean {
	
	@NotBlank(message = "notificationId is mandatory")
	private String notificationId;
	@NotBlank(message = "notificationType is mandatory")
	private String notificationType;
	private String interactionType;
	@NotBlank(message = "messageType is mandatory")
	private String messageType;
	private String subDocumentLocation;
	private FulfillmentSubDocument subDocument;
	
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}
	public String getInteractionType() {
		return interactionType;
	}
	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getSubDocumentLocation() {
		return subDocumentLocation;
	}
	public void setSubDocumentLocation(String subDocumentLocation) {
		this.subDocumentLocation = subDocumentLocation;
	}
	public FulfillmentSubDocument getSubDocument() {
		return subDocument;
	}
	public void setSubDocument(FulfillmentSubDocument subDocument) {
		this.subDocument = subDocument;
	}
	
	@Override
	public String toString() {
		return "FulfillmentOutcomeManagerBean [notificationId=" + notificationId + ", notificationType="
				+ notificationType + ", interactionType=" + interactionType + ", messageType=" + messageType
				+ ", subDocumentLocation=" + subDocumentLocation + ", subDocument=" + subDocument + "]";
	}
	

}
