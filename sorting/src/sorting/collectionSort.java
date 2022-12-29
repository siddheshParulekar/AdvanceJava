package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Model1 {
	
	private int id;
	private String name;
	public Model1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Model1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return " [" + id + ", " + name + "]";
	}
	
	

}

public class collectionSort {
	
	public static void main(String[] args) {
		List<Model1> model = new ArrayList<Model1>();
		Model1 m1 = new Model1(1, "Dati catastali ei fini dell'imposta progressiva patrimoniale");
		Model1 m2 = new Model1(10, "Stazione taurin");
		Model1 m3 = new Model1(11, "Torelli da ingrasso");
		Model1 m4= new Model1(12, "Vendita legname per cantiere navale");
		Model1 m5 = new Model1(21, "Carteggio Ufficio distrettuale…");
		Model1 m6 = new Model1(5, "Consorzio Agrario Provinciale");
		
		model.add(m1);
		model.add(m2);
		model.add(m3);
		model.add(m4);
		model.add(m5);
		model.add(m6);
		
		System.out.println(model);
	   Collections.sort(model,new Comparator<Model1>() {

		@Override
		public int compare(Model1 o1, Model1 o2) {
			// TODO Auto-generated method stub
			
			
			return o1.getName().compareTo(o2.getName());
		}
	});	
	
	}

}
