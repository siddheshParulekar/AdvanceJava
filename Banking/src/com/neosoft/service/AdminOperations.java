package com.neosoft.service;

import java.text.BreakIterator;
import java.util.Scanner;

import com.neosoft.application.Banking;
import com.neosoft.model.Customer;

public class AdminOperations {
	Scanner scanner =new Scanner(System.in);
	
	int accNo;
	//String cutname;
	int age;
	
	public void adminLogin() {
		System.out.println("Enter Username");
		String username = scanner.nextLine();
		
		System.out.println("Enter password");
		String password = scanner.nextLine();
		
		if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin")) {
			adminOps();
		}
		else {
			System.out.println("enter valid details");
			adminLogin();
		}
		
	}
	
	
	public void adminOps() {
		System.out.println(" Admin ops");
		int choice;
		do {
			
			System.out.println("select the type of service");
			System.out.println("1. Open an account for new Customer\r\n"
					+ "2. Deposit\r\n"
					+ "3. Withdraw\r\n"
					+ "4. Delete an account\r\n"
					+ "5. View all the customers of the bank\r\n"
					+ "6. Log Out\r\n"
					+ ""	);
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("");
				 Customer custo =  openAccount();
				 try {
					 System.out.println(custo.getCustName() + "your Account is Successfully opened ");
				} catch (Exception e) {
					// TODO: handle exception
					
				}
				
				
				break;
				
			case 2:
			    System.out.println("");
			    deposit();
			    break;
			    
			case 3:
				System.out.println("Thanks ");
				withdraw();
				break;
				
			case 4:
				deleteAcc();
				
				break;
				
			case 5:
				viewAll();
				break;
				
			case 6:
			     break;

			default:
				break;
			}
			
		} while (choice != 6);
		
		
		
	}


	private void deleteAcc() {
		// TODO Auto-generated method stub
		Customer c=getCustomerByAccountNo();
		if(c !=null) {
			Banking.customerList.remove(c);
			System.out.println(Banking.customerList);
			System.out.println("Account deleted succsessfully");
		}else {
			System.out.println("Account not find");
			
		}
		
	}


	private void viewAll() {
		// TODO Auto-generated method stub
		System.out.println(Banking.customerList);
		
	}


	private void withdraw() {
		// TODO Auto-generated method stub
		Customer c=getCustomerByAccountNo();
		//System.out.println(c.getAccNo() + " " + c.getCustName() + " " + c.getAccNo());
		if(c!=null) {
			System.out.println("Enter amount you want to withdraw:");
			int amount=scanner.nextInt();
			Double newamt = c.getBalance() - amount;
			c.setBalance(newamt);
			System.out.println(" Current balance:"+c.getBalance());
		}else {
			System.out.println("Account not find");
			
		}
		
	}


	private void deposit() {
		// TODO Auto-generated method stub
		Customer c=getCustomerByAccountNo();
		//System.out.println(c.getAccNo() + " " + c.getCustName() + " " + c.getAccNo());
		if(c!=null) {
			System.out.println("Enter amount you want to deposite:");
			int amount=scanner.nextInt();
			Double newamt = c.getBalance() + amount;
			c.setBalance(newamt);
			System.out.println(" Current balance:"+c.getBalance());
		}else {
			System.out.println("Account not find");
			
		}
		
		
	
		
		
		
	}


	private Customer openAccount() {
		// TODO Auto-generated method stub
		Customer customer =null;
		System.out.println("enter account no");
		accNo = scanner.nextInt();
		System.out.println("enter accountholder name");
		String cutname = scanner.next();
		System.out.println("enter age");
		age = scanner.nextInt();
		
		
		if(age >= 21) {
			 customer = new Customer(accNo,cutname,age,0);
			//System.out.println(customer);
			Banking.customerList.add(customer);
			return customer;
		}else {
			System.out.println("User is not eligible");
		}
		return customer;
			
	}
	
	
	public Customer getCustomerByAccountNo() {
		Customer searchedCustomer=null;
		System.out.println("Enter account no");
		int accNo=scanner.nextInt();
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

}
