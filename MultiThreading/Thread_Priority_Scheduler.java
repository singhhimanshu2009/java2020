class MyThread extends Thread{

    public void run(){
    System.out.println("Child Thread Name "+Thread.currentThread().getName()); 
    System.out.println("Child Thread Priority "+Thread.currentThread().getPriority());
    for(int i=0;i<10;i++){
             System.out.println("Child Thread ");
    }    
    
    }
    
}
public class Thread_Priority_Scheduler{
    
    public static void main(String ...aa){
    
     System.out.println("Main Thread Name "+Thread.currentThread().getName()); // main
     System.out.println("Main Thread Priority "+Thread.currentThread().getPriority()); // 5
    
    MyThread t1 =new MyThread();
    t1.setPriority(10);
    t1.start();

    for(int i=0;i<10;i++){
             System.out.println("Main Thread ");
    } 

}
}
