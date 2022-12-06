package BankApp;

public class AdminManager {
	
	public void krediBasvurusunuOnayla(Account account)
	{
		if(account.krediBasvurusu) 
		{
			System.out.println("Başvurunuz onaylanmıştır.");
			account.bakiye += account.istenenKredi;
			account.krediBasvurusu = false;
		}else {
			
			System.out.println("Kredi başvurusu yapılmamıştır.");
		}
		
		
	}
	public void krediBasvurusunuReddet(Account account)
	{
		if(account.krediBasvurusu) 
		{
			System.out.println("Kredi başvurunuz reddedilmiştir.");
			account.istenenKredi = 0.0;
			account.krediBasvurusu = false;
		}else {
			
			System.out.println("Kredi başvurusu yapılmamıştır.");
		}
		
	}

}
