package com.symbiosis.trade.service;

import com.symbiosis.trade.Entity.Trade;

import java.util.*;


public interface TradeService {

	

	List<Trade> getAllTrade();
	
	Trade saveTrade(Trade t) ;
	
	Trade getTradeById(String s);
	
	Trade updateTrade(Trade t);
	
	void deleteTradeById(String id);
	
	void updateExpired(Trade t);
	
	
	
}
