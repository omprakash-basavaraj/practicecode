package com.om.moneytransfer.model;

public class MoneyExchange {
	
	private String fromCurrency;
	private String toCurrency;
	private Double originalAmount;
	private Double exchangeAmount;
	private Double fees;
	private Double amtToBePaid;
	
	
	public MoneyExchange() {
		super();
	}

	public String getFromCurrency() {
		return fromCurrency;
	}
	
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	
	public String getToCurrency() {
		return toCurrency;
	}
	
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	
	public Double getOriginalAmount() {
		return originalAmount;
	}
	
	public void setOriginalAmount(Double originalAmount) {
		this.originalAmount = originalAmount;
	}
	
	public Double getExchangeAmount() {
		return exchangeAmount;
	}
	
	public void setExchangeAmount(Double exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}
	
	public Double getFees() {
		return fees;
	}
	
	public void setFees(Double fees) {
		this.fees = fees;
	}
	
	public Double getAmtToBePaid() {
		return amtToBePaid;
	}
	
	public void setAmtToBePaid(Double amtToBePaid) {
		this.amtToBePaid = amtToBePaid;
	}

	
}
