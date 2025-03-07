public class Queue<Item> {
	// Holds front object in queue
	public Node front;
	
	// Holds back object in queue
	public Node back;
	
	// Add person to queue
	public void enqueue(Person person) {
		// If queue is empty
		if (back == null) {
			// Creating new node at back of queue and setting person
			back = new Node(person);
			// Only one person in queue, so front is also back
			front = back;
			// Returning as person has been added
			return;
		}
		
		// Creating new node and setting person
		Node newNode = new Node(person);
		// Adding node to back of queue
		back.next = newNode;
		// New node is now the back of the queue
		back = newNode;
	}
	
	// Remove person from front of queue and return them
	public Person dequeue() {
		// If queue is empty return null
		if (front == null) {
			return null;
		}
		
		// Getting person from front of queue
		Person person = front.person;
		// Setting front to next node in queue
		front = front.next;
		// Returning person that was removed
		return person;
	}
	
	// Print out people in queue
	public void printQueue() {
		// Holds current node to be printed
		Node currentNode = front;
		// Iterating through queue until end is reached
		while (currentNode != null) {
			// Printing out person info
			System.out.print(currentNode.person.firstName + " ");
			System.out.print(currentNode.person.lastName + " ");
			System.out.print(currentNode.person.age);
			System.out.println();
			
			currentNode = currentNode.next;
		}
	}
	
}
