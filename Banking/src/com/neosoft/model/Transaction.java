package com.neosoft.model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.neosoft.service.TransactionType;



public class Transaction {
	
	private String date;
	private TransactionType transactionType;
	private double amount;
	private double balance;
	
	public Transaction(TransactionType transactionType, double amount, double balance,String date) {
		super();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		date = dtf.format(now);
		
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance = balance;
		this.date=date;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Transaction(String date, TransactionType transactionType, double amount) {
		super();
		this.date = date;
		this.transactionType = transactionType;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
	
	
	
	
}
