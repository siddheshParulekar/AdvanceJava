public class Student {


	    public int rollNo;
	    public String name;
	    public int getRollNo() {
	        return rollNo;
	    }
	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public Student(int rollNo, String name) {
	        super();
	        this.rollNo = rollNo;
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return " [rollNo=" + rollNo + ", name=" + name + "]";
	    }

	}
	


