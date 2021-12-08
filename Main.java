package bankAccount;

public class Main {

	public static void main(String[] args) {
		Account AnasAccount = new Account("12345", "  anas  saad  ", "anas@hotmail");
//		AnasAccount.withdrawal(100);
//		AnasAccount.deposit(200);
//		AnasAccount.withdrawal(150);
		System.out.println(AnasAccount.getCustomerName());
		System.out.println(AnasAccount.contactWithCustomer());
		
		Account AliAccount = new Account("55555", "   ali   aldoori ", "07234538" , "bagarbyvägen");
		AliAccount.deposit(500);
		System.out.println(AliAccount.getCustomerName());
		AliAccount.withdrawal(600);
		System.out.println(AliAccount.contactWithCustomer());
	}

}
