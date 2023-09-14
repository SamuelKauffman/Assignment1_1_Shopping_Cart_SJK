
public class Application {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Item 1", 10.99);
        Item item2 = new Item("Item 2", 5.99);
        Item item3 = new Item("Item 3", 7.49);

        cart.AddItem(item1);
        cart.AddItem(item2);
        cart.AddItem(item3);
        
        System.out.println("Total price " + cart.CalculateTotalPrice());

        cart.PrintCartContents();

        Item itemToRemove = item2;
        cart.RemoveSpecificItem(itemToRemove);
        System.out.println("Removed: " + itemToRemove.getName());

        System.out.println("Updated Cart Contents:");
        cart.PrintCartContents();

        Item itemToCheck = item1;
        System.out.println("Cart contains " + itemToCheck.getName() + ": " + cart.Contains(itemToCheck));

        System.out.println("Total items in the cart: " + cart.GetNumberOfItems());
        
        System.out.println(cart.RemoveAllItems());
        
        System.out.println("Updated Cart Contents:");
        cart.PrintCartContents();
    }
}
