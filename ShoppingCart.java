
/**
 * @author sam KAuffman
 * @version 1.0
 *
 */
public class ShoppingCart {

    private ArrayBag<Item> shoppingBag;

    /**
     * Constructor
     */
    public ShoppingCart() {
        shoppingBag = new ArrayBag<>();
    }

    /**
     * @return The number of items in the cart.
     */
    public int GetNumberOfItems() {
        return shoppingBag.getCurrentSize();
    }

    /**
     * @return True if the cart is empty, false if not.
     */
    public boolean IsEmpty() {
        return shoppingBag.isEmpty();
    }

    /**
     * @param item to add to the cart.
     * @return True if the addition is successful, false if not.
     */
    public boolean AddItem(Item item) {
        return shoppingBag.add(item);
    }

    /**
     * @param item to remove from the cart.
     * @return True if the item was successfully removed, false otherwise.
     */
    public boolean RemoveSpecificItem(Item item) {
        return shoppingBag.remove(item);
    }

    /**
     * @return The removed item, or null if the cart is empty.
     */
    public Item RemoveItem() {
        return shoppingBag.remove();
    }

    /**
     * @return True if items were removed, false otherwise.
     */
    public boolean RemoveAllItems() {
        shoppingBag.clear();
        return true;
    }

    /**
     * @param item to count.
     * @return The number of times the item in the cart.
     */
    public int NumberOfItem(Item item) {
        return shoppingBag.getFrequencyOf(item);
    }

    /**
     * @param item to check for.
     * @return True if the cart contains the item, false otherwise.
     */
    public boolean Contains(Item item) {
        return shoppingBag.contains(item); 
    }

    /**
     * Prints the contents of the shopping cart.
     */
    public void PrintCartContents() {
        Object[] items = shoppingBag.toArray();
        for (Object item : items) {
        	Item currentItem = (Item) item;
            	System.out.println(currentItem.toString());
        }
    }
    /**
     * @return the carts total
     */
    public double CalculateTotalPrice() {
    	 Object[] items = shoppingBag.toArray();
         double total = 0;
         for (Object item : items) {
         	Item currentItem = (Item) item;
         	total += currentItem.getPrice();
         }
         return total;
    }
}

	
