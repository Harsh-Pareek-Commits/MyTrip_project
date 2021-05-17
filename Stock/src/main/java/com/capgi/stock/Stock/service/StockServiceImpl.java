package com.capgi.stock.Stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgi.stock.Stock.bean.Stock;
import com.capgi.stock.Stock.bean.Transaction;
import com.capgi.stock.Stock.dao.StockRepository;
import com.capgi.stock.Stock.dao.TransactionRepository;
@Service
public class StockServiceImpl implements StockService {
	@Autowired
	StockRepository mystock;
	@Autowired
	TransactionRepository myTransaction;
	@Override
	public List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		return mystock.findAll();
	}

	@Override
	public Stock saveStock(Stock s) {
		// TODO Auto-generated method stub
		mystock.save(s);
		return s;
	}
	@Override
	public Transaction saveTransaction(Transaction t) {
		// TODO Auto-generated method stub
		myTransaction.save(t);
		return t;
	}
	

}
