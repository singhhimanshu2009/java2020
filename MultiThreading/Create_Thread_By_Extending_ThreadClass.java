class MyThread extends Thread{

    public void run(){
        
        for(int i=0;i<10;i++){
                System.out.println(2*i);      
        }   
        
    }

}

public class Create_Thread_By_Extending_ThreadClass {

	public static void main(String[] args) {
	
    MyThread t1 =new MyThread();
   
     t1.start();

        for(int i=0;i<10;i++){
            
               System.out.println(3*i);
    
        }
            

	}

}
