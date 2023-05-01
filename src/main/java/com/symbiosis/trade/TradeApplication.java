package com.symbiosis.trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.symbiosis.trade.repository.TradeRepository;


@SpringBootApplication()
public class TradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeApplication.class, args);
	}
	
	@Autowired
	private TradeRepository tr;
	
	public void run(String... args) throws Exception {
		
		
		
		 
		
	}

}
