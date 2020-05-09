package Multithreding;

class MyDaemon extends Thread{
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Is Daemon Thread");
			
			for(int i=0 ;i<10;i++) {
				
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("Deamon "+i);
				
			}
			
		}else {
			
			System.out.println("Is Not Daemocn");
		}
		
	}
	
	
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread start");
		
		MyDaemon t1 =new MyDaemon();
		t1.setDaemon(true);
		t1.start();
		
		
		for(int i=0 ;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("MAiN Thread "+i);
		}

	}

}
