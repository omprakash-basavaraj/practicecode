package com.om.restapitest.currexchg.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.om.restapitest.currexchg.Model.ExchangeRate;

@Mapper
public interface CurrExchgMapper {

	
	@Select("select * from Curr_Exchg_Rates where fromCurr=#{fromCurr} and toCurr=#{toCurr}")
	ExchangeRate getExchangeRate(@Param("fromCurr") String fromCurrency, @Param("toCurr") String toCurrency);
}
