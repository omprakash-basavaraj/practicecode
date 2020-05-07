package com.om.moneytransfer.model;

public class ExchangeRate {
	
	private String fromCurr;
	private String toCurr;
	private double conversionRate;
	
	
	public String getFromCurr() {
		return fromCurr;
	}
	
	public void setFromCurr(String fromCurr) {
		this.fromCurr = fromCurr;
	}
	
	public String getToCurr() {
		return toCurr;
	}
	
	public void setToCurr(String toCurr) {
		this.toCurr = toCurr;
	}
	
	public double getConversionRate() {
		return conversionRate;
		
	}
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}
	
	

}
