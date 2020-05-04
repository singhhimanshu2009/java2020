public class SleepExample {

	public static void main(String[] args) throws Exception{
		
		for(int i=0;i<10;i++) {
            Thread.sleep(1000);
			System.out.println("Main thread");
		}
	}

}
