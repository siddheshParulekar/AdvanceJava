package com.neosoft.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	//private int id;
	private int accNo;
	private String custName;
	private int age;
	private Double balance;
	
	private List<Transaction> transactionList = new ArrayList<>();
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public Customer( int accNo, String custName, int age,double balance) {
		super();
		//this.id = id;
		this.accNo = accNo;
		this.custName = custName;
		this.age = age;
		this.balance =balance;
		
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
	
	public int getAccNo() {
		return accNo;
	}
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", custName=" + custName + ", age=" + age + ", balance=" + balance + "]";
	}
	
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	
	public void addTransaction(Transaction transaction) {
		if(this.transactionList == null)
			this.transactionList = new ArrayList<>();
		this.transactionList.add(transaction);
	}
	
	
	

}
