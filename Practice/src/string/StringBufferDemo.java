package string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("ascfe");
		System.out.println(s1);
		System.out.println(s1.capacity());
//	 System.out.println());
		
		s1.append("Parulekar");
		s1.append("sunil");
		
		System.out.println(s1);
		s1.insert(0, "Mr");
		System.out.println(s1.capacity());
		System.out.println(s1);
		
		
		StringBuffer s2 = new StringBuffer();
		//append
		s2.append("Rahul");
		System.out.println(s2);
		
		//replace
		s2.replace(1, 3, "gupta");
		System.err.println(s2);
		System.out.println(s2.delete(1, 3));
		
		
		
		
		
		
		
	}

}
