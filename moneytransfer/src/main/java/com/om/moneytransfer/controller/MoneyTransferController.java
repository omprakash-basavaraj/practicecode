package com.om.moneytransfer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
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
	Logger logger = LoggerFactory.getLogger(MoneyTransferController.class);
	
	@RequestMapping("/moneytransfer")
	@Retryable(value=RuntimeException.class,maxAttempts=5, backoff=@Backoff(delay=60000))
	public MoneyExchange calculateExchg(@RequestParam(value="TotalAmount") Double amount,
										@RequestParam(value="FromCurre") String fromCurr,
										@RequestParam(value="ToCurr", defaultValue="USD") String toCurr){
		
		
		logger.info("API call for amount:" + amount + "from currency:" + fromCurr + "to currency:" + toCurr);
		ExchangeRate exchangeRate =  restTemplate.getForObject("http://localhost:8087/getxchg?FROM_CURRENCY={fromCurr}&TO_CURRENCY={toCurr}", 
																ExchangeRate.class,fromCurr,toCurr);
		
		return moneyTransferDao.getAmountDetails(amount,fromCurr,toCurr,exchangeRate);
		
	}
}
