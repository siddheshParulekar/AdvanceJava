import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {


        List<Student> maplist=new ArrayList<>();

        maplist.add(new Student(1, "pavan"));
        maplist.add(new Student(2, "Dhoni"));
        maplist.add(new Student(3, "kohli"));

        //maplist.forEach(System.out::println);

        Map<Integer,Student> IS=new HashMap<>();


       System.out.println("list to map.......");
       System.out.println( maplist.stream().collect(Collectors.toMap(a -> a.name, Function.identity())));
       
       
       Map<Integer, String> map = new HashMap<>();
		map.put(1, "sameer");
		map.put(2, "arvind");
		map.put(3, "sid");
		map.put(4, "rahul");
		Set<Integer> set1 = map.keySet();
		System.out.println("keys of " +set1);
//		set1
		
		
		Collection<String> set2 =  map.values();
		System.out.println(set2);
		
		
		List<Integer> collect = map.entrySet().stream().map(c->c.getKey()).collect(Collectors.toList());
		System.out.println(collect);


    }

}
