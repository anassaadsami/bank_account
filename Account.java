package bankAccount;

public class Account {
	private String Number ;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private String customerAdderss;
	private static String bankName = "Swed bank";
	
	static {
		Account a = new Account("   hiba  saad ");    // ex we put just name in website and invoke this constructor
		System.out.println("Welcome to Swedband "+ a.getCustomerName());   // the only way to access non static variable 
	}                                                                      // into static block or method 
	public Account(String customerName) {
		setCustomerName(customerName);
	}
	public Account(String Number , String customerName , String customerEmail ) {
		this.Number = Number ;
		setCustomerName( customerName);
		setCustomerEmail(customerEmail);
	}
	public Account(String Number , String customerName , String customerPhone , String address ) {
		this.Number = Number ;
		setCustomerName( customerName);
		setCustomerPhone(customerPhone);
		setCustomerAdderss(customerPhone);
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("your balance now is "+ this.balance);
	}
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount <= 0)
		System.out.println("only "+ this.balance +" available. you can not withdrawal "+ withdrawalAmount);
		else { 
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal "+ withdrawalAmount + " is completed. Remaining balance are "+ this.balance);
		}
	}
	public String contactWithCustomer() {
		String contactWay = "";
		if(this.customerEmail == null)          // if(this.customerEmail.equals(null)-----> error
			contactWay = this.getCustomerPhone();
		else if(this.customerPhone == null)      // if(this.customerPhone.isEmpty)----> error 
			contactWay = this.getCustomerEmail();
		return contactWay;
	}
	public String getCustomerAdderss() {
		return customerAdderss;
	}
	public void setCustomerAdderss(String customerAdderss) {
		this.customerAdderss = customerAdderss;
	}
	public static String getBankName() {
		return bankName;
	}
	
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		this.Number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName ="";
		customerName = customerName.trim();
		customerName = customerName.replaceAll("\\s+", " ");   //    to replace if there is more than one whitespace to just one space 
		if(!Character.isUpperCase(customerName.charAt(0)))
			this.customerName += Character.toUpperCase(customerName.charAt(0));
		for (int i = 1; i < customerName.length(); i++) {
			if(Character.isWhitespace(customerName.charAt(i))) {
				this.customerName += customerName.charAt(i);
				this.customerName += Character.toUpperCase(customerName.charAt(i+1));
				i += 1;
			}else 
				this.customerName += customerName.charAt(i);	
		}
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	

}
