package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Muliplecatch {
	
	
	public static void main(String[] args) {
		
		try {
			
			String s1=null;
			
			System.out.println(s1.charAt(2));
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arrithmetic exception it is");
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("indexOutOfBoundsException it is");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("nullPointerException it is");
		}finally {
			System.out.println("Excuting finally block");
		}
		
		
		//checkedException
		
		try {
			FileInputStream GFG
            = new FileInputStream("/Desktop/GFG.txt");
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		
		
		
		
	}

}
