package com.symbiosis.trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symbiosis.trade.Entity.Trade;


public interface TradeRepository extends JpaRepository<Trade,String> {

	
	
}
