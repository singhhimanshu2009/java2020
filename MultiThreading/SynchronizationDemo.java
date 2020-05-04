class PrintTable{
	
	public synchronized void  displayPrint(int num) {
		
		for(int i=1;i<10;i++) {
			System.out.println(i*num);
		
        	try {
				Thread.sleep(1000);
			}catch (Exception e) {
			

			}
		}
		
	}
	
}

class ThreadOne extends Thread{
	
	PrintTable printTable;
	int num;
	
	public ThreadOne(PrintTable printTable ,int num) {
		this.printTable =printTable;
		this.num =num;
		
	}
	
	public void  run() {
		printTable.displayPrint(num);
	}
}

class ThreadTwo extends Thread{
	
	PrintTable printTable;
	int num;
	
	public ThreadTwo(PrintTable printTable ,int num) {
		this.printTable =printTable;
		this.num =num;
		
	}
	
	public void  run() {
		printTable.displayPrint(num);
	}
}



public class SynchronizationDemo {

	public static void main(String[] args) {
		
		PrintTable p1 =new PrintTable();
		
		ThreadOne t1 =new ThreadOne(p1,2);
		ThreadTwo t2 =new ThreadTwo(p1,3);
		
		t1.start();
		t2.start();
		
		p1.displayPrint(4);
	}

}
