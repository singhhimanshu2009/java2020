abstract class Account{
	
	String accountHolderName;
	String address;
	String dob;
	String phone;
	
	public  abstract int getIntrestRate();
	
	public final void  display() {
		
		System.out.println("Account Type            	   = "+this.getClass().getName());
		System.out.println("accountHolderName              = "+this.accountHolderName);
		System.out.println("address              		   = "+this.address);
		System.out.println("dob              			   = "+this.dob);
		System.out.println("IntrestRate              	   = "+this.getIntrestRate());
		
		
	}
	
	
}

class SavingAccount extends Account{
	
	public SavingAccount(String accountHolderName,String address,String dob,String phone ) {
		
		this.accountHolderName =accountHolderName;
		this.address =address;
		this.dob=dob;
		this.phone =phone;
		
	}


	public int getIntrestRate() {
		return 3;
	}
	
}

class CurrentAccount extends Account{
	
	public CurrentAccount(String accountHolderName,String address,String dob,String phone ) {
		
		this.accountHolderName =accountHolderName;
		this.address =address;
		this.dob=dob;
		this.phone =phone;
		
	}


	public int getIntrestRate() {
		return 0;
	}
	
}

public class finalRuntimePolymorephism {

	public static void main(String[] args) {
		
		Account a1 =new SavingAccount("Himanshu","ABCD","01-01-2020","1234567895");
		a1.display();
		System.out.println("=========================================================");
		Account a2 =new CurrentAccount("Shivani","ABCD","01-01-2020","1253591251");
		a2.display();

	}

}
