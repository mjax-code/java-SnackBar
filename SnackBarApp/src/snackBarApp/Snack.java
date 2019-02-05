package snackBarApp;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		this.name = name;
		this.quantity = quantity;
		this.vendingMachineId = vendingMachineId;
		this.cost = cost;
		maxId++;
		id = maxId;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int amount)
	{
		quantity += amount;
	}

	public double buySnack(int amount)
	{
		quantity -= amount;
		return amount * cost;
	}

	// public double getCost(int amount)
	// {
	// 	return amount * cost;
	// }
}
