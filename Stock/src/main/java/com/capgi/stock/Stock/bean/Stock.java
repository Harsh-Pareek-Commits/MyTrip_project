package com.capgi.stock.Stock.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int stock_Id;
	String stockName;
	int stockPrice;
	 
	/*
	 * @OneToOne(mappedBy = "stock") private Transaction transaction;
	 */
	@OneToOne(mappedBy = "stock") 
	private Transaction transaction;
	
	public Stock() {
		super();
		
	}

	public Stock(int stock_Id, String stockName, int stockPrice, Transaction transaction) {
		super();
		this.stock_Id = stock_Id;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.transaction = transaction;
	}

	public int getStock_Id() {
		return stock_Id;
	}

	public void setStock_Id(int stock_Id) {
		this.stock_Id = stock_Id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Stock [stock_Id=" + stock_Id + ", stockName=" + stockName + ", stockPrice=" + stockPrice
				+ ", transaction=" + transaction + "]";
	}
	
	
	
	 
	 

	 
	 
	
	

}
