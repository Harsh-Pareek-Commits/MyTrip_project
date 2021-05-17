package com.capgi.stock.Stock.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.capgi.stock.Stock.bean.Stock;
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int t_id;
	
	 int quantity;
	 String transactionType;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Stock_info", referencedColumnName = "stock_Id")
		private Stock stock;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int t_id, int quantity, String transactionType, Stock stock) {
		super();
		this.t_id = t_id;
		this.quantity = quantity;
		this.transactionType = transactionType;
		this.stock = stock;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Transaction [t_id=" + t_id + ", quantity=" + quantity + ", transactionType=" + transactionType
				+ ", stock=" + stock + "]";
	}

	
	
	
	 
}
