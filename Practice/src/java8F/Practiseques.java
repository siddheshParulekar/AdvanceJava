 package java8F;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

class Employee {
	int id;
	int salary;
	String nameString;

	public Employee(int id, int salary, String nameString) {
		super();
		this.id = id;
		this.salary = salary;
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", nameString=" + nameString + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

}

public class Practiseques {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 20000, "sidd");
		Employee e2 = new Employee(2, 23000, "rahul");
		Employee e3 = new Employee(3, 30000, "adii");
		Employee e4 = new Employee(4, 40000, "asx");

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e3);
		empList.add(e2);
		empList.add(e4);
		// System.out.println(empList);

		empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.salary > o2.salary) {
					return -1;
				} else if (o1.salary < o2.salary) {
					return 1;
				}
				return 0;
			}
		}).forEach(System.out::println);
//		System.out.println(emp2);
//		emp2.forEach( System.out::println);
//		empList.forEach(emp->System.out.println(emp));

//				map(e -> e.getSalary())
	List<Employee> emp1=	empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.salary > o2.salary) {
					return 1;
				} else if (o1.salary < o2.salary) {
					return -1;

				}

				return 0;
			}

		}).collect(Collectors.toList());
	
	System.out.println("......");
	System.out.println(emp1);
	System.out.println("......");
int legth = 	emp1.size();
System.out.println("Second highest" + emp1.get(legth-2));
		// System.out.println(empList.stream().map(e ->
		// e.getSalary()).collect(Collectors.toList()));

		empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.nameString.compareTo(o2.nameString);
			}

		}).forEach(System.out::println);
		;

		System.out.println("by id");

		empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub

				if (o1.id > o2.id) {
					return 1;

				} else if (o1.id < o2.id) {
					return -1;
				}
				return 0;
			}
		}).forEach(System.out::println);
		
		
		
		System.out.println("list to map: ");
		empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getNameString)).forEach((k,v)-> System.out.println(k +" " + v));

	}

}
