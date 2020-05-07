package com.om.restapitest.currexchg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.om.restapitest.currexchg.controller.CurrencyExchgController;

@SpringBootApplication
public class CurrexchgApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CurrexchgApplication.class, args);
		
	}

}
