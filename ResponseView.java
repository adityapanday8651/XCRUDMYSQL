package com.test.model.view;

public class ResponseView {
	private String message;
	private boolean status;
	public String getMessage() {
		return message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
