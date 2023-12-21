package workassignment;



//java bean: reusable component which actually holds the data is used to hold the data
//encapsulation
//Assignment 18:  (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
//Customer: If any products ordered by customer, compare with the data stored and display the total price along with the details of product. 
//(Use  DAO, bean and client classes)


public class Seller {
//private properties
private int id;
private String name;
private double price;

public Seller(int id, String name, double price) {// constructor injection
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
//getters and setters method



public int getId() {
	return id;//
}
public void setId(int id) { // setter method injection
	//(instance variable)
	this.id  = id;//refers to local variable
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

public void addSeller(Seller sel) {
	// TODO Auto-generated method stub

}

}