/**
 * A concrete class representing an item that can be stored in a shopping cart.
 */
public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String toString() {
    	return name;
    }

    // You can add more methods and fields as needed for your items.
}
