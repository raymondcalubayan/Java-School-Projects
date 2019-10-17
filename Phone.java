
public class Phone {
	private String brand;
	private int capacity;
	private String model;
	private double purchaseprice;

	public Phone() {
		brand = "";
		capacity = 0;
		model = "";
		purchaseprice = 0.00;

	}

	public Phone(String b, int c, String m, Double p) {
		brand = b;
		capacity = c;
		model = m;
		purchaseprice = p;
	}

	public String getBrand() {
		return brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getModel() {
		return model;
	}

	public double getPurchaseprice(){
		return purchaseprice;
	}

	public void setBrand(String b) {
		brand = b;
	}

	public void setCapacity(int c) {
		capacity = c;
	}

	public void setModel(String m) {
		model = m;
	}

	public void setPurchaseprice(double p) {
		purchaseprice = p;
	}

/*
 * Name of method: equals 
 * 
 * The equals method compares 2 different phone objects for equality. 
 * The parameters it takes in are two different phone objects.
 * The method returns true if both the brand and model are the same, regardless of capacity. 
 * Otherwise, the method returns false. 
 */
	public boolean equals(Phone phone1) {
		if ((this.getBrand().equals(phone1.getBrand())) && (this.getModel().equals(phone1.getModel()))) {
			return true;
		} else
			return false;
	}
	
	/*
	 * Name of method: toString
	 *  
	 * The toString method converts objects created in the class to a String.  
	 * No parameters are passed. 
	 * The Brand, Capacity, Model, and Price are returned.   
	 */

	public String toString() {
		return "Brand: " + brand + "\n" + "Capacity: " + capacity + "GB" + "\n" + "Model: " + model + "\n" + "Price: $" + purchaseprice;
	}
	
	/*
	 * Name of method: calculateTax
	 *  
	 * The calculateTax method calculates the amount of tax you will pay on the phone. 
	 * The parameter you will pass the method is a double, which is the tax rate. 
	 * The method will then return the amount in tax it calculated. 
	 */

	public double calculateTax(double taxRate) {
		double tax = purchaseprice * taxRate;
		return tax;
	}
	
	/*
	 * Name of method: isAffordable
	 *  
	 * The isAfforable method determines if the phone you are specifying is affordable according 
	 * to your budget. 
	 * The parameter you will pass the method is a double, which is your budget. 
	 * If the budget is greater than the purchase price, the method will return true.
	 * Otherwise, it will return false.
	 */

	public boolean isAffordable(double budget) {
		if (budget > purchaseprice)
			return true;
		else
			return false;
	}
}
