package project1;

public class Project1Tester {

	public static void main(String[] args) {
		
		UnbndQueueWithStack<String> queue = new UnbndQueueWithStack <String>();
		
		//Test QueueUnderflowException
		//System.out.println("Dequeuing: " + queue.dequeue());
		
		//Test isEmpty
		System.out.println("Is the Queue Empty? " + queue.isEmpty());
		
		//Test enqueue
		queue.enqueue("Kenyarda - 1st in queue");
		queue.enqueue("Jayden - 2nd in queue");
		queue.enqueue("BJ - 3rd in queue"); 
		 
		//Test size
		System.out.println("Number in queue: " + queue.size());
		 
		//Test dequeue
		System.out.println("Dequeuing: " + queue.dequeue());
		  
		//Test size after a dequeue  
		System.out.println("Number in queue: " + queue.size());
		
		//Test enqueue after a dequeue
		queue.enqueue("Jennifer");
		
		//Test size again after above enqueue
		System.out.println("Number in queue: " + queue.size());
		
		//Test dequeue again
		System.out.println("Dequeuing: " + queue.dequeue());
		
		//Test isEmpty.  Should return false this time.
		System.out.println("Is the Queue Empty? " + queue.isEmpty());
		 
	}

}
