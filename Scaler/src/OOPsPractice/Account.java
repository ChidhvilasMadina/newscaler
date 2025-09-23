package OOPsPractice;

public class Account extends Bank {
	private long Accnumber;
	private double balance;
	private String name;
	
	public Account(String name, long accnumber, Double balance) {
		//super();
		this.Accnumber = accnumber;
		this.balance =balance;
		this.name = name;
	}

	public long getAccnumber() {
		return Accnumber;
	}

	public void setAccnumber(long accnumber) {
		Accnumber = accnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display() {
		System.out.println(this.Accnumber+"  "+this.name);
	}

	@Override
	public String toString() {
		return "Account [Accnumber=" + Accnumber + ", balance=" + balance + ", name=" + name + "]";
	}
	
	public double deposit(Account acc,double amount) {
		return this.balance+amount;
	}
	public double withdraw(Account acc,double amount) {
		if(this.balance>amount) {
			return this.balance-amount;
		}
		else {
			System.out.println("Balace Amount not sufficient");
		}
			return balance;
		
	}
	

}
