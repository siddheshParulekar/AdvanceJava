package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import abstraction.interfaceDemo;

class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub

		if (marks == o.marks) {
			return 0;
		} else if (marks > o.marks) {
			return 1;

		} else  {
			return -1;
		}
	}

}

public class CompbarableDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Sidd",100);
		Student s2 = new Student(2,"sau",110);
		Student s3 = new Student(3,"addi",80);
		Student s4 = new Student(4,"vimlesh",70);
	
		List<Student> l1 = new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		Collections.sort(l1);
		System.out.println(l1);

	}

}
