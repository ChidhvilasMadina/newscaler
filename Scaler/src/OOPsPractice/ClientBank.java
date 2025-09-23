package OOPsPractice;

public class ClientBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("Ram",62300001,20000.0);
		Account a2=new Account("Raju",62300002,30000.0);
		Account a3=new Account("Rahul",62300003,40000.0);
		Account a4=new Account("Rahhim",62300004,45000.0);
		Account a5=new Account("Robert",62300005,70000.0);
		
		Bank bank = new Bank();
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);
		bank.addAccount(a4);
		bank.addAccount(a5);
		
		bank.AccountDeposit(a1, 1000);
		bank.Amountwithdraw(a5, 100000);
		
		for(Account i:bank.li) {
			i.display();
		}
		System.out.println("---------------------------------");
		
	}

}
