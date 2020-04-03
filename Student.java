public class Student{	

static String collegeName =" LJPSVM";

int rollno ;
String  name ;

public Student(int r,String n){
	rollno =r;
	name=n;
}

public void display(){
	System.out.println(rollno);
	System.out.println(name);
	System.out.println(Student.collegeName);
}

public static void main (String [] arr){
	
	Student obj =new  Student(12 ,"vishu");
	Student obj2 =new  Student(13 ,"ramanuj");
	obj.display();
	obj2.display();
}
}