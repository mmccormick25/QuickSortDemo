
public class Main {

	public static void main(String[] args) {
		
		// Creating empty queue for people
		Queue personQueue = new Queue();
		
		// Enqueueing 5 people
		personQueue.enqueue(new Person("John", "Baker", 42));
		personQueue.enqueue(new Person("Pam", "Henderson", 18));
		personQueue.enqueue(new Person("Ron", "Paul", 42));
		personQueue.enqueue(new Person("John", "Avery", 26));
		personQueue.enqueue(new Person("Mary", "Shelly", 31));

		// Printing unsorted Queue
		System.out.println("Unsorted Queue:");
		personQueue.printQueue();
		System.out.println();
		
		// Quicksort object to sort queue
		QuickSort quickSort = new QuickSort();
		
		// Sorting by last name
		quickSort.sort(personQueue.front, personQueue.back, "name");
		// Printing osrted queue
		System.out.println("Sorted by Last Name:");
		personQueue.printQueue();
		System.out.println();
		
		// Sorting by age
		quickSort.sort(personQueue.front, personQueue.back, "age");
		// Printing sorted queue
		System.out.println("Sorted by Age:");
		personQueue.printQueue();
		System.out.println();
	}
	
}
