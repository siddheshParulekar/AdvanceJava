package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		
		List<Model> model = new ArrayList<Model>();
		Model m1 = new Model(1, "Dati catastali ei fini dell'imposta progressiva patrimoniale");
		Model m2 = new Model(10, "Stazione taurin");
		Model m3 = new Model(11, "Torelli da ingrasso");
		Model m4= new Model(12, "Vendita legname per cantiere navale");
		Model m5 = new Model(21, "Carteggio Ufficio distrettuale…");
		Model m6 = new Model(5, "Consorzio Agrario Provinciale");
		
		model.add(m1);
		model.add(m2);
		model.add(m3);
		model.add(m4);
		model.add(m5);
		model.add(m6);
		
		//by numbers:		
		Collections.sort(model,new NumberComparator());
//		for(Model md : model) {
//			System.out.println(md);
//		}
//		
		//by alphabets:
		Collections.sort(model,
				new Comparator<Model>() {
			@Override
			public int compare(Model o1,Model o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for(Model md : model) {
			System.out.println(md);
		}
		
		 
		
		
	}

}
