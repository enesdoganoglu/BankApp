package BankApp;

public class UserManager {
	
	String mailTipi;
	
	public void otomatikEmailOlustur(User user)
	{
		mailTipi = "@xbanka.com";
		String otomatikOlusanEmail = user.name+"."+user.surname+mailTipi;
		user.email = otomatikOlusanEmail;
		System.out.println(user.email);
	}
	public void krediBasvurusundaBulun(Account account, int para) 
	{
		account.istenenKredi = Double.valueOf(para);
		System.out.println(account.istenenKredi +" Tl değerinde kredi başvurusunda bulundunuz.\n"+"Lütfen onay bekleyin");
		account.krediBasvurusu =true;
	}
	public void krediKartiBorcuOdeme(Account account, double taksit)
	{
		if(account.istenenKredi <= 0) 
		{
			System.out.println("Kredi borcunuz yoktur.");
		}else if(account.istenenKredi > 0 && account.istenenKredi >= taksit) {
			
			account.istenenKredi = account.istenenKredi - taksit;
			System.out.println(taksit+" Tl kadar borç ödediniz, Güncel kredi borcunuz: "+account.istenenKredi);
			
		}else {
			System.out.println("Borcunuzdan fazla tutar ödeyemezsiniz.\nLütfen başka bir tutar girin.");
		}
		
	}
	public void bilgileriGoster(User user) 
	{
		System.out.println("isim: "+user.name+" surname: "+user.surname
				+" HesapNo: "+user.account.hesapNo+" Email: "+user.email
				+" Hesap Bakiyeniz: "+user.account.bakiye+ " Kalan kredi borcunuz "+user.account.istenenKredi) ;
		
	}

}
