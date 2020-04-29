class MyThread extends Thread{

    public void run(){
    System.out.println(Thread.currentThread().getName());
    }
    
}


public class GetSetName_Of_Thread{
        
    public static void main(String... x){
            
        System.out.println(Thread.currentThread().getName());// main
        Thread.currentThread().setName("vishu");
        System.out.println(Thread.currentThread().getName());// java2020
        
        MyThread t1 =new MyThread();
        t1.setName("child_Thread");
        t1.start();
    }        
}
