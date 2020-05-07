package com.om.moneytransfer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.om.moneytransfer.dao.moneyTransferDao;
import com.om.moneytransfer.model.ExchangeRate;
import com.om.moneytransfer.model.MoneyExchange;

@RestController
public class MoneyTransferController {

	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/moneytransfer")
	public MoneyExchange calculateExchg(@RequestParam(value="TotalAmount") Double amount,
										@RequestParam(value="FromCurre") String fromCurr,
										@RequestParam(value="ToCurr", defaultValue="USD") String toCurr){
		
		
		ExchangeRate exchangeRate =  restTemplate.getForObject("http://localhost:8087/getxchg?FROM_CURRENCY={fromCurr}&TO_CURRENCY={toCurr}", 
																ExchangeRate.class,fromCurr,toCurr);
		
		return moneyTransferDao.getAmountDetails(amount,fromCurr,toCurr,exchangeRate);
		
	}
}
