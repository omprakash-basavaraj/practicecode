package com.om.restapitest.currexchg.controller;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.om.restapitest.currexchg.Model.ExchangeRate;
import com.om.restapitest.currexchg.dao.CurrExchgMapper;


@RestController
public class CurrencyExchgController {
	
	Logger logger = LoggerFactory.getLogger(CurrencyExchgController.class);
	
	@Autowired
	private CurrExchgMapper currExchgMapper;

	@RequestMapping("/getxchg")
	public ExchangeRate getExchangeRate(@RequestParam(value="FROM_CURRENCY") String fromCurrency,
										@RequestParam(value="TO_CURRENCY", defaultValue="USD") String toCurrency) {
		
		logger.error("this is ERROR log");
		logger.warn("this is WARN log");
		logger.info("this is INFO log");
		logger.debug("this is DEBUG log");
		return currExchgMapper.getExchangeRate(fromCurrency,toCurrency);		
	}
	
}
