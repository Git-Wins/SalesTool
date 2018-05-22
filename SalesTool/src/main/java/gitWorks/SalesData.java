package gitWorks;

public class SalesData {

	int data[] = {0, 4, 42, 55, 66}; /*-?|first_review|Winston.vijay|c0|?*/
	
	//display method in the SalesData file /*-?|SalesData.java-display() method|Winston.vijay|c0|*/
	public void display() { /*-|SalesData.java-display() method|Winston.vijay|c0|?*/
		System.out.println("Data: ");
		//using the for-each loop
		for(int k:data) {
			System.out.println("Next value:" +k);
		}
	}
}
