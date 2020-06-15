package Enum;

enum Beer{
	 kf,El,Fo,TB,KB,Bw,vishu;
}

public class Test {

	public static void main(String[] args) {
		
				
		Beer b =Beer.vishu;
		
		Beer [] b1=Beer.values();
		for(Beer b3 :b1) {
			System.out.println(b3+" "+b3.ordinal());
		}
		
		
		switch(b) {
		case kf:
			System.out.println("kf beer");
			break;
		case vishu:
			System.out.println("vishu beer");
			break;
		case Fo:
			System.out.println("beer");
			break;
			default:
			System.out.println("Default");
		}
		
		
	}

}
