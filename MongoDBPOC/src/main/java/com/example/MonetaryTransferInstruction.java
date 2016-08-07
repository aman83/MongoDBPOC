package com.example;

import java.util.List;

import org.springframework.data.annotation.Id;

public class MonetaryTransferInstruction {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String status;
	
	private String customerId;
	
	private List<MonetaryTransferInstance> monetaryTransferInstance; 
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<MonetaryTransferInstance> getMonetaryTransferInstance() {
		return monetaryTransferInstance;
	}

	public void setMonetaryTransferInstance(List<MonetaryTransferInstance> monetaryTransferInstance) {
		this.monetaryTransferInstance = monetaryTransferInstance;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	private String amount;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MonetaryTransferInstruction [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", status=" + status + ", customerId=" + customerId + ", monetaryTransferInstance="
				+ monetaryTransferInstance + ", amount=" + amount + "]";
	}

	
}
