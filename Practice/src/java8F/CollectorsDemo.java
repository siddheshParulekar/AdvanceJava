package java8F;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product{
	
	int id;
	int price;
	String Productname;
	
	public Product(int id, int price, String productname) {
		super();
		this.id = id;
		this.price = price;
		Productname = productname;
	}
	
	
	
	
	
}

public class CollectorsDemo {
	
	
	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();  
		Product p1= new Product(1, 10000, "Laptop");
		Product p2= new Product(2, 20000, "mobile");
		Product p3= new Product(3, 30000, "tv");
		Product p4= new Product(4, 40000, "pc");
		Product p5= new Product(5, 50000, "tablet");
		Product p6= new Product(6, 60000, "AC");
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		productsList.add(p4);
		productsList.add(p6);
		//productsList.add(p1);
		
		
		
		
		Set<Integer>priceList = productsList.stream().map(x->x.price).collect(Collectors.toSet());
		System.out.println(priceList  );
		
	}
	
	
	

}
