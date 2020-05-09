package Multithreding;

class A{
	
	public synchronized void m1(B b) {
	
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Oye B apna last method de");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("A class Last Method is call");
	}
}

class B{
	
	public synchronized void m2(A a) {
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Oye A apna last method de");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("B class Last Method is call");
	}
}

class MyThreaad extends Thread{
	
	A a =new A();
	B b=new B();

	public void display() {
		this.start();
		a.m1(b);
	}

	public void run() {
		b.m2(a);
	}
}

public class DeadLockDemo {

	public static void main(String[] args) {
	
		
		MyThreaad t1 =new MyThreaad();
		t1.display();
		

	}

}
