package gitWorks;

public class SalesData {

	int data[] = {0, 4, 42, 55, 66}; /*-?|first_review|Winston.vijay|c0|?*/
	
	//display method
	public void display() {
		System.out.println("Data: ");
		//using the for-each loop
		for(int k:data) {
			System.out.println("Next value:" +k);
		}
	}
}
