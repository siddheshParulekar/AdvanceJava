package com.neosoft.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.neosoft.model.Customer;
import com.neosoft.service.AdminOperations;
import com.neosoft.service.CustomerOps;

public class Banking {
	
	
     public static List<Customer> customerList = new ArrayList<>();
	public static void main(String[] args) {
		

		CustomerOps customerOps = new CustomerOps();
		AdminOperations adminOperations = new AdminOperations();
		
		Scanner scanner =new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("1. Login as Admin 2. Login as Customer 3. Exit "	);
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Welcome To admin login");
				adminOperations.adminLogin();
				
				break;
				
			case 2:
			    System.out.println("Welcome to user login");
			    customerOps.custLogin();
			    break;
			    
			case 3:
				System.out.println("Thanks ");
				break;

			default:
				break;
			}
			
		} while (choice != 3);
	}
}
