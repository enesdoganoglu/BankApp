package BankApp;

public class User {
	
	String name;
	String surname;
	String email;
	Account account;
	public User(String name, String surname, Account account) {
		super();
		this.name = name;
		this.surname = surname;
		this.account = account;
	}
	

}
