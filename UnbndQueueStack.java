package project1;



public class UnbndQueueStack<T> {
	
	protected int numElements = 0;    // number of elements in the queue
	private ArrayListStack<UnbndQueueStack<T>> stack1;
	private ArrayListStack<UnbndQueueStack<T>> stack2;
	
	public UnbndQueueStack()
	{
		stack1 = new ArrayListStack<UnbndQueueStack<T>>();
		stack2 = new ArrayListStack<UnbndQueueStack<T>>();
	}
	
	//@SuppressWarnings("unchecked")
	/*public T dequeue()  throws Exception
	{
		
		if (stack1.isEmpty())
			
		{
			throw new Exception("Dequeue attempted on empty queue.");
		}
		
		else if (stack2.isEmpty())
		
			while(!stack1.isEmpty())
			stack2.push(((StackInterface<T>) stack1).pop());
			
		T tempstack = null;
		if(!stack2.isEmpty())
		{
			tempstack = stack2.pop();
			numElements--;
		}
		
		return tempstack;
					   
		
	}*/
	
	
	public boolean isEmpty()
	// Returns true if this queue is empty; otherwise, returns false
	  {              
	    return (numElements == 0);
	  }

	
	@SuppressWarnings("unchecked")
	public void enqueue(T element) 
	{
	
		((UnboundedStackInterface<T>) stack1).push(element);
		System.out.println("Enqueueing: " + element);		
		numElements++;
	}
	
	public int size()
	{
		return numElements;
	}
	

}
