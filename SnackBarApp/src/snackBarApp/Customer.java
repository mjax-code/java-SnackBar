package snackBarApp;

public class Customer
{
	private static int maxId = 0;
	private int id; 
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		this.name = name;
		this.cashOnHand = cashOnHand;
		maxId++;
		id = maxId;
	}

	public void addCash(double amount)
	{
		cashOnHand += amount;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}
	
	public void buySnack(double cost)
	{
		cashOnHand -= cost;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
