/* Name: Raymond Calubayan
 * 
 * Description: This is the Collection class. This class keeps an array of Phone objects and keeps track of
 * the number of Phones in the class.
 * 
 * Due Date: 11/1/18
 * 
 */
public class PhoneStore {

	private Phone phoneDisplay[];
	private int numPhones;

	public PhoneStore(){
		phoneDisplay = new Phone [100];
		numPhones = 0;
	}
	
	/*
	 * Name of method: add 
	 * 
	 * The add method adds Phone objects to the collection. It also increments the number of phones in the array.
	 * 
	 * The parameters it takes in are a String for the brand, an integer for the capacity, a String for the model, and 
	 * a Double for the purchase price. 
	 * 
	 * The method is void, so it does not return anything.
	 */
	
	public void add(String b, int c, String m, Double p){

		phoneDisplay[numPhones++] = new Phone(b, c, m, p);
	}
	
	/* 
	 * Name of method: findPhone
	 * 
	 * The findPhone method loops through and searches for a phone in the array.
	 * 
	 * The parameters is takes in are a String for the phone model. 
	 * 
	 * If found, the method returns the corresponding phone object it found in the array.
	 * If not found, it returns null. 
	 */

	public Phone findPhone(String m){

		for (int j=0; j < numPhones; j++){
			if (phoneDisplay[j] != null && phoneDisplay[j].getModel().equalsIgnoreCase(m))
				return phoneDisplay[j];
		}
		return null;
	}
	
	/*
	 * Name of method: toString
	 *  
	 * The toString method converts data members created in the collection class to a String.  
	 * No parameters are passed. 
	 * The phone objects in the array of the class are returned in String form.  
	 */

	public String toString(){

		String results = "";
		for (int i=0; i<numPhones; i++)
			results += phoneDisplay[i].toString() + "\n";

		return results;
	}

}