package Collection;

import java.util.TreeSet;

class Student implements Comparable{
	
	int rollNo ;
	String Name;
	
		
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}


	@Override
	public int compareTo(Object obj1) {
		
		Student s1 =(Student)obj1;
		
		if(this.rollNo <s1.rollNo){
			return -1;
			
		}else if(this.rollNo >s1.rollNo)
			return +1;
		else
		return 0;
	}

	
	
}

public class TreeSetDemoTwo {

	public static void main(String[] args) {
		
		TreeSet t1 =new TreeSet();
		
		Student s1 =new Student(1,"vishu");
		Student s2 =new Student(2,"java");
		Student s3 =new Student(3,"java");
		
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		
		System.out.println(t1);
		
		
	}

}
