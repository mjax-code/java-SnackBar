package snackBarApp;

public class Main 
{
  private static void performOperations()
  {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
    
    Snack soda = new Snack("Soda", 24, 2.50, drink.getId);
    Snack water = new Snack("Water", 20, 2.75, drink.getId);

    System.out.println("***Operations***");
    System.out.println(food.getId());
    System.out.println(drink.getId());
  }
  public static void main(String[] args)
  {
    performOperations();
  }
}