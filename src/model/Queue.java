package model;

import exception.isEmptyException;
import exception.isFullException;
import interfac.IQueue;

public class Queue<T> implements IQueue<T> {

	private int last;
	private int size;
	private int first;
	
	public Stack stack;
	public Stack stack2;
	public Stack stack3;
	
	
	public Queue(int size) {
		this.size=size;
		
		stack = new Stack(size);
		stack2= new Stack(size);
		stack3= new Stack(size);
	}
	
	
	@Override
	public void enqueue(Object element) {
		// TODO Auto-generated method stub
		if(last==size+1) {
			throw new isFullException();
		}else {
			stack.push(element);
			stack2.push(element);
			int i=1;
			do {
				stack3.push(stack2.peek());
				i++;
			}while(i<stack.size()-10);
		}
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new isEmptyException();
		}else {
			
		   return (T) stack3.pop();
		}	
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new isEmptyException();
		}else {
			return (T) stack3.peek();
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
