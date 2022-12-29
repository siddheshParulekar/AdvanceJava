 package java8F;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	
	
	public static void main(String[] args) {
		
		
		StringJoiner s1 = new StringJoiner( ",","[","]");
		s1.add("sidd");
		s1.add("sidd");
		s1.add("sidd");
		s1.add("sidd");
		s1.add("sidd");
		System.err.println(s1);
	}

}
