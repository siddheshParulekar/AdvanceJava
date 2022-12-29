package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NestedTry {

	public static void main(String[] args) {
		try {
		         System.out.println(args[0]);
			FileInputStream fis = new FileInputStream(new File(args[0]));
			
			int res = 0, num = 2;
			try {
				res = num / 0;
				System.out.println("The result is" + res);
			} // try
			catch (ArithmeticException a) {
				System.out.println("Arithmatic Exception has been raised");
				a.printStackTrace();
			} // catch
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception has been raised");
			e.printStackTrace();
		} // catch
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Index Out Of Bounds Exception has been raised");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception has been raised");
			e.printStackTrace();
		} // catch
	}// main
}// class
