package com.example;

public class MonetaryTransferInstance {
	
	private String status;
	private String transferSendDate;
	private String transferDeliverDate;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransferSendDate() {
		return transferSendDate;
	}
	public void setTransferSendDate(String transferSendDate) {
		this.transferSendDate = transferSendDate;
	}
	public String getTransferDeliverDate() {
		return transferDeliverDate;
	}
	public void setTransferDeliverDate(String transferDeliverDate) {
		this.transferDeliverDate = transferDeliverDate;
	}

	@Override
	public String toString() {
		return "MonetaryTransferInstance [status=" + status + ", transferSendDate=" + transferSendDate
				+ ", transferDeliverDate=" + transferDeliverDate + "]";
	}
}
