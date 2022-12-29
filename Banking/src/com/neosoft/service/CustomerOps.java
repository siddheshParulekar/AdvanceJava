package com.neosoft.service;

import java.util.Scanner;

import com.neosoft.application.Banking;
import com.neosoft.model.Customer;

public class CustomerOps {
	Scanner scanner =new Scanner(System.in);
	
	int accNo;
	String username;
	Customer currentCustomer=null;
	public void custLogin() {
		
		Customer c=getCustomerByAccountNo();
		if(c!=null) {
			currentCustomer = c;
			custOps();
		}
		else {
			System.out.println("account not find");
		}
		
		
	}
	
	
	public void custOps() {
		System.out.println("Customer ops");
		int choice;
		do {
			
			System.out.println("select the type of service");
			System.out.println("1. View account details  \r\n"
					+ "2.View All Transaction\r\n"
					+ "3. Transfer Money \r\n"
					+ "4. View last 5 transactions\r\n"
					+ "5. Log Out\r\n"	);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Customer c = getCustomerByAccountNo();
				System.out.println(c);
				
				
				break;
				
			case 2:
			    System.out.println("");
			   
			    break;
			    
			case 3:
				System.out.println(" ");
				transferMoney();
				
				break;
				
			case 4:
				
				
				break;
				
			case 5:
				
				break;
				
			

			default:
				break;
			}
			
	}while (choice != 5);
	}
	
	
	public Customer getCustomerByAccountNo() {
		Customer searchedCustomer=null;
		System.out.println("Enter account no");
		int accNo=scanner.nextInt();
		System.out.println("Enter username");
		username = scanner.next();
		for(int i=0;i<Banking.customerList.size();i++) {
			Customer c1=Banking.customerList.get(i);
			if(c1.getAccNo()==accNo) {
				searchedCustomer=c1;
				//System.out.println(searchedCustomer.getAccNo());
				return searchedCustomer;
			}
		}
		return searchedCustomer;
	}
	
	public void transferMoney() {
		Customer reciverCustomer=null;
		Customer rcust=getCustomerByAccountNo();
		
		if(rcust!=null) {
			System.out.println(rcust.getAccNo() + " " + rcust.getCustName());
			reciverCustomer=rcust;
			System.out.println("Enter amount you want to transfer:");
			int amount=scanner.nextInt();
			if(amount < currentCustomer.getBalance()) {
				double newamt = rcust.getBalance() + amount;
				double senderAmount= currentCustomer.getBalance() - amount;
				currentCustomer.setBalance(senderAmount);
				rcust.setBalance(newamt);
			}
			else {
				System.out.println("......not sufficient balance......");
			}
			System.out.println(" Your current bal : "+currentCustomer.getBalance());

			
		}
		else {
			System.out.println("receiver account number not found........");
		}
		
		
		// TODO Auto-generated method stub

	}


}
