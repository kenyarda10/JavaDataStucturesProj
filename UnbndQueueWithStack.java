package project1;

import java.util.Stack;

public class UnbndQueueWithStack<T>     {

	protected int numElements = 0;    // number of elements in the queue
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	
	public UnbndQueueWithStack()
	{
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}
	
	public T dequeue()  
	{
		
		if (stack1.isEmpty())
			
		{
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		}
		
		else if (stack2.isEmpty())
		
			while(!stack1.isEmpty())
			stack2.push(stack1.pop());
			
		T tempstack = null;
		if(!stack2.isEmpty())
		{
			tempstack = stack2.pop();
			numElements--;
		}
		
		return tempstack;
					   
		
	}
	
	
	public boolean isEmpty()
	// Returns true if this queue is empty; otherwise, returns false
	  {              
	    return (numElements == 0);
	  }

	
	public void enqueue(T element) 
	{
	
		stack1.push(element);
		System.out.println("Enqueuing: " + element);		
		numElements++;
	}
	
	public int size()
	{
		return numElements;
	}
	
	

}
