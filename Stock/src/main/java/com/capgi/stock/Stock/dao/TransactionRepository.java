package com.capgi.stock.Stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgi.stock.Stock.bean.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}

