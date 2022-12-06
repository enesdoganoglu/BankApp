package BankApp;

public class AccountManager {
	
	
	
	public void paraYatir(Account account,double miktar)
	{
		
		if(miktar<10000)
		         {
			
			               account.bakiye += miktar;
			               System.out.println(miktar+" Tl Yatırdınız, Güncel Bakiyeniz: " +account.bakiye); 
		         }
	    else 
		         {
			
		
			               System.out.println("10000 Tl ve üzeri para yatıramazsınız. "); 
		         }
		
		
	}
	
	public void paraCek(Account account, double miktar)
	{
		if(miktar>account.bakiye) 
		       {
			          System.out.println("Bakiyeniz Yetersiz"); 
			
		       }
		else
		      {
			         account.bakiye -= miktar;
			         System.out.println(miktar+" Tl Çektiniz, Güncel Bakiyeniz: " +account.bakiye); 
		      }
		   
		
	}
	
	public void hesapBilgileriniGoster(Account account){
    	 
		System.out.println("Hesap Nonuz: " +account.hesapNo+  " Güncel Hesap Bakiyeniz " +account.bakiye);
		
		
	}

}
