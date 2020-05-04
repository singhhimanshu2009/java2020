class Mythread extends Thread{

public void run(){

    for(int i=0;i<10;i++){
        System.out.println("child thread");
        Thread.yield();
    }
}
}

class YieldDemo{

public static void main(String ...x){

Mythread t1 =new Mythread();

t1.start();

 for(int i=0;i<10;i++){
        System.out.println("main thread");
    }

}

}
