package collections;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		
		//create a list array
		ArrayList<String> carlist = new ArrayList<String>();
		
		//add elements to the array list
		carlist.add("Ford");
		carlist.add("Toyoda");
		carlist.add("Kia");
		carlist.add("Chevy");
		carlist.add("Lexus");

		//print elements out to demonstrate it worked. 
		System.out.println(carlist);
		
		//add Buick to the last postition
		carlist.add(4, "Buick");
		
		//print elements out to demonstrate it worked. 
		System.out.println(carlist);
		
		//Change Toyoda to Toyota
		carlist.set(1, "Toyota");
		
		//print elements out to demonstrate it worked. 
		System.out.println(carlist);
		
		//Remove Kia from the list.
		carlist.remove(2);
		
		//print elements out to demonstrate it worked. 
		System.out.println(carlist);
		
		//Use a loop to print the array elements in a nicer way.
		for(String car:carlist)
			System.out.println(car);
		
		//Display the number of elements in the array.
		System.out.println("The number of elements in the car list array is "+carlist.size()+".");
		
		
		
		
		
	}

}
