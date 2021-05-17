package com.capgi.stock.Stock.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capgi.stock.Stock.bean.Stock;
import com.capgi.stock.Stock.bean.Transaction;
import com.capgi.stock.Stock.service.StockService;

@RestController
@RequestMapping("/api")
public class StockRestController {
	@Autowired
	private StockService service;
	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome : My Stock App "+LocalDateTime.now();
	}
	
	@PostMapping("/stock")
	public Stock insertStock(@RequestBody Stock stock) {
		service.saveStock(stock);
		return stock;
	}
	
	@GetMapping("/stocks")
	public List<Stock> getAllStocks() {
		return service.getAllStocks();
	}
	
	@GetMapping("/transaction")
	public Transaction insertTransaction(@RequestBody Transaction t) {
		service.saveTransaction(t);
		return t;
	}
}
