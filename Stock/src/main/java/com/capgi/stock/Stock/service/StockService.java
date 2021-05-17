package com.capgi.stock.Stock.service;

import java.util.List;
import com.capgi.stock.Stock.bean.Stock;
import com.capgi.stock.Stock.bean.Transaction;

public interface StockService {
	public List<Stock> getAllStocks();
	public Stock saveStock(Stock s);
	public Transaction saveTransaction(Transaction t);
	
	
	
	/*
	 * www....../stock/Infosys/300/buy (increase stock price by 2% on every batch of
	 * 100) b) www....../stock/Infosys/300/sell (decrease stock price by 2% on every
	 * batch of 100) c) www..../stocks (show all stocks) d) www.../transactions
	 * (show all transaction) e) www.../transaction/101 (show stock details and
	 * transaction details of transaction id = 101)
	 */
	
}
