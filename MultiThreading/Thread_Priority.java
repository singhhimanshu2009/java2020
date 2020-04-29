/*
 
 Min    1
 Normal 5
 Max    10

0 to 10

1 to 10

*/

class MyThread extends Thread{

    public void run(){
    System.out.println("Child Thread Name "+Thread.currentThread().getName()); // Thread 0
    System.out.println("Child Thread Priority "+Thread.currentThread().getPriority()); //5
    }
    
}

public class Thread_Priority{

public static void main(String ...aa){
    
     System.out.println("Main Thread Name "+Thread.currentThread().getName()); // main
    
     Thread.currentThread().setPriority(10);

     System.out.println("Main Thread Priority "+Thread.currentThread().getPriority()); // 10
    
    MyThread t1 =new MyThread();
    t1.start();

}

}

