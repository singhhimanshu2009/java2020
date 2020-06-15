package InnerClass;

public class AnnonymousTwo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("child Thread");
				}
			}
		};
		
		t1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		

	}

}
