package BankApp;

import java.util.Random;

public class Account {
	
	String hesapNo;
	Double bakiye =0.0;
	boolean krediBasvurusu = false;
	Double istenenKredi;
	
	public Account() {
		
		Random sayi = new Random();
		int sayi1 = sayi.nextInt(999999,9999999);
		
		this.hesapNo = String.valueOf(sayi1);
		
	}
	
	

}
