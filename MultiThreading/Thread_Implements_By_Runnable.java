class MyThread implements Runnable{

public void run(){

    for(int i=0;i<10;i++){
        System.out.println("child Thread");
    }    
    
}

}
class Thread_Implements_By_Runnable{
    public static void main(String[]arr){
        
       MyThread obj =new MyThread();
        
        Thread t1 =new Thread(obj);
        
        t1.start();

    
         for(int i=0;i<10;i++){
        System.out.println("main Thread");
         }
      
    }

}



