package sorting;

import java.util.Comparator;

public class NumberComparator implements Comparator<Model> {

	@Override
	public int compare(Model o1, Model o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
	
	

}
