/**
 * @author sam KAuffman
 * @version 1.0
 */
public class Item {

    private String name;
    private double price;

    /**
     * @param name
     * @param price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param item name
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     * @return item price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * @param item price
     */
    public void setPrice(double price) {
    	this.price = price;
    }
    
    /**
     * @return items name
     */
    public String toString() {
    	return name;
    }
}
