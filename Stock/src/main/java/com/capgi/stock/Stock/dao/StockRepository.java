package com.capgi.stock.Stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgi.stock.Stock.bean.Stock;
import com.capgi.stock.Stock.bean.Transaction;

public interface StockRepository extends JpaRepository<Stock, Integer>{

}
