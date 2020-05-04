class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
            
              try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
			System.out.println("child thread");
            
		}
				
	}
}

public class JionExample {

	public static void main(String[] args) throws Exception{
		
		MyThread t1 =new MyThread();
		
		t1.start();
		t1.join(1000);
        t1.intrrupt();
       
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
	}

}
