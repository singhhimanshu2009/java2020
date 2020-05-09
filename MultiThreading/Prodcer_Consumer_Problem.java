package Multithreding;

class Buffer{
	
	int value =0;
	public boolean flag =false;
	
	public synchronized void perduce(int v)  {
		System.out.println("pruduser is start");
		if(flag == true) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		value =v;
		flag =true;
		System.out.println(value +" is produse");
		notify();
	}
	
	
	public synchronized void consume() {
		
		System.out.println("Consumer is start");
		if(flag == false) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(value +" is consume");
		flag = false;
		notify();
	}
	
}

class ProduserThread extends Thread{
	
	public Buffer b;

	public  ProduserThread(Buffer b) {
				this.b = b;
	}
	
	public  void run() {
		
		for(int i=1;i<10;i++) {
					b.perduce(i);
		}
		
	}	
}

class ConsumerThread extends Thread{
	
	public Buffer b;
	
	
	public ConsumerThread(Buffer b) {
				this.b = b;
	}
	
	public void run() {
		for (int i=0;i<=10;i++) {
			b.consume();
		}
				
	}	
}

public class Prodcer_Consumer_Problem {

	public static void main(String[] args) {
		Buffer b =new Buffer();
		
		ProduserThread p1 =new ProduserThread(b);
		ConsumerThread c1 =new ConsumerThread(b);
		
		p1.start();
		c1.start();
		
	}

}
