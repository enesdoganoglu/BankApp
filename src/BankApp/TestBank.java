package BankApp;

public class TestBank {

	public static void main(String[] args) {
		
		
		Account account1 = new Account();
		AccountManager accoutManager = new AccountManager();
		User user1 = new User("Enes","Doğanoğlu",account1);
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		
		accoutManager.paraYatir(account1, 500);
		accoutManager.paraYatir(account1, 2000);
		accoutManager.paraCek(account1, 1000);
		accoutManager.hesapBilgileriniGoster(account1);
		
		
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuOnayla(account1);
		
		accoutManager.hesapBilgileriniGoster(account1);
		
		
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.bilgileriGoster(user1);


		

	}

}
