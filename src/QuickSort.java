public class QuickSort {
	// Partitioning queue with back as pivot
	public Node partitionBack(Node front, Node back, String sortBy) {
		// If front and back are same node, queue is already sorted
		if (front == back) {
			return front;
		}
		
		// Holds smallest node found in queue. This node will be moved towards the back until it
		// is eventually swapped with the back
		Node currentNode = front;
		// Holds next pivot position, will end up at 1 before the end node
		Node nextPivot = front;
		
		// Iterating through queue from front to back
		while (front != back) {
			// Variable to hold if nodes should be swapped after compared
			boolean swap = false;
			// If you want to sort by name
			if (sortBy == "name") {
				// If front person last name belongs after back person last name
				if (front.person.lastName.compareTo(back.person.lastName) > 0) {
					swap = true;
				}
			// Sorting by age
			} else {
				// If front person age is belongs after back person age
				if (front.person.age > back.person.age) {
					swap = true;
				}
			}
			
			if (swap) {
				// Setting nextPivot to current node
				nextPivot = currentNode;
				// Creating temp variable for current node
                Person temp = currentNode.person;
                // Swapping front and current node
                currentNode.person = front.person;
                front.person = temp;
                // Iterating currentNode
                currentNode = currentNode.next;
			}
			// Moving front to next position in queue
			front = front.next;
		}
		
		// currentNode belongs after the back node, so we swap them here
		Person temp = currentNode.person;
		currentNode.person = back.person;
		back.person = temp;
		
		// Returning nextPivot
		return nextPivot;
		
	}
	
	public void sort(Node front, Node back, String sortBy) {
		// Continuing until queue is fully partitioned to single objects
		if (front == back) {
			return;
		}
		
		// Partitioning queue
		Node nextPivot = partitionBack(front, back, sortBy);
		// Sorting first half of queue recursively
		sort(front, nextPivot, sortBy);
		// Sorting second half of queue recursively
		sort(nextPivot.next, back, sortBy);
	}
}
