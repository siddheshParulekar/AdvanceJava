package string;

class example{
	
	static String s1="Siddhesh";
	
}

public class StringDemo extends example {
	static String s1 = "Sid";
	public static void main(String[] args) {
		//creation of string
	 System.out.println(StringDemo.s1); 
	 System.out.println(example.s1);
		String s4 = "Sid";
		String s2 = "Sau";
		String s3 = new String("Parulekar");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		//methods
		
		System.out.println(s1.contains("Sf"));
		
		System.out.println(s3.charAt(3));
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.concat("PArulekar"));
		
	}

}
