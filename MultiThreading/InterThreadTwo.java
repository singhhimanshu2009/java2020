class MyThread extends Thread{
	
	int total=0;
	
	public void run() {
		System.out.println("Prform Calulation");

    
		synchronized (this){

          for(int i=0;i<=100;i++) {
				
				total = i+total;
										
			}
                System.out.println("Notification Bhej rha hu");
                this.notify();
            }
 			
                //50 k
            
		}
	
		}

public class InterThreadTwo {

	public static void main(String[] args)throws Exception {
		
        MyThread t1 =new MyThread();
    
            t1.start();
        Thread.sleep(10000);
        synchronized (t1){
                System.out.println("main thread gya wating state me");
                 t1.wait(1000);
            System.out.println("Notification mil gyi h");
           System.out.println(t1.total);
        }
            
           

	}

}
