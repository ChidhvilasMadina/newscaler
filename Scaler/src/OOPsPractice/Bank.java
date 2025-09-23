package OOPsPractice;

import java.lang.classfile.AnnotationValue.OfString;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	List<Account> li=new ArrayList<>();
	public void addAccount(Account a) {
		li.add(a);
	}
	public void removeAccount(Account a) {
		li.remove(a);
	}
	public double AccountDeposit(Account acc,double amount) {
		double bal=acc.deposit(acc,amount);
		System.out.println("updated Balance is "+ bal+""+acc.getName());
		return bal;
	}
	public double Amountwithdraw(Account acc,double amount) {
		double bal=acc.withdraw(acc, amount);
		System.out.println("Balance amout is"+ bal);
		return bal;
			
		
	}

}
