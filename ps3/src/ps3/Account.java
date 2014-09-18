package ps3;
import java.util.Date;


public class Account {
	
	
	private int ID;
	private double Balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account()
	{
		this.ID = 0;
		this.Balance = 0.0;
		this.annualInterestRate = 0.0;
	}
	
	Account(int ID,double Balance,double annualInterestRate)
	{
		this.ID = ID;
		this.Balance = Balance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getId()
	{
		return ID;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public void setId(int ID)
	{
		this.ID=ID;
	}
	public void setBalance(double Balance)
	{
		this.Balance = Balance;
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
		
	}
	public void setDateCreated()
	{
		dateCreated = newdateCreated;
	}
	
	double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
		
	}
	
	
	double withdraw(double amount)
	{
		return Balance -= amount;
	}
	
	double deposit(double amount)
	{
		return Balance += amount;
	}
	
public static void main (String[] args)
{
	Account Test = new Account(1122, 20000.00, 0.045);
	Test.withdraw(2500.00);
	Test.deposit(3000.00);
	System.out.println("The balance is:" + Test.Balance);
	System.out.println("The monthly interest is:" + Test.getMonthlyInterestRate());
	System.out.println("The account was created on:" + Test.dateCreated);
}
}	
	


