package com.om.moneytransfer.dao;

import com.om.moneytransfer.model.ExchangeRate;
import com.om.moneytransfer.model.MoneyExchange;

public class moneyTransferDao {
	
	
	
	public static MoneyExchange getAmountDetails(Double amount, String fromCurr, String toCurr,ExchangeRate exchangeRate) {
		
		MoneyExchange moneyExchange = new MoneyExchange();
		
		moneyExchange.setOriginalAmount(amount);
		moneyExchange.setFromCurrency(fromCurr);
		moneyExchange.setToCurrency(toCurr);
		moneyExchange.setExchangeAmount(amount * exchangeRate.getConversionRate());
		moneyExchange.setFees((amount*6.75)/100);
		moneyExchange.setAmtToBePaid(amount+moneyExchange.getFees());
		
		return moneyExchange;
		
	}
	
	

}
