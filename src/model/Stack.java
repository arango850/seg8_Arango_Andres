package model;

import exception.isEmptyException;
import exception.isFullException;

public class Stack<T> {

	private int size;
	private int current;
	private T stack[];
	
	public Stack( int size) {
		this.size = size;
		current =0;
		stack= (T[]) new Object[this.size];
	}
	
	public void push(T obj) {
		if(current>size) {
			throw new isFullException();
		}else {
			stack[current++]= obj;
		}
	}
	
	public T pop() {
		if(current ==0) {
			throw new isEmptyException();
			
		}else {
			return stack[-- current];
		}
	}
	
	public T peek() {
		if(current==0) {
			throw new isEmptyException();
			
		}else {
			int aux = current;
			return stack[--aux];
		}
	}
	
	public int size() {
		return size;
	}
	
	
}

