package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	private Queue queue;
	
	public void inicioTest() {
		queue = new Queue(5);
		
		assertEquals(queue.stack.size(),5);
	}
	
	public void pushTest() {
		queue = new Queue(5);
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		
		assertEquals(queue.front(),"4");
	}
	
	public void frontTest() {
		queue = new Queue(5);

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		
		assertEquals(queue.front(),"D");
		
		
	}
	
	public void popTest() {
		queue = new Queue(5);

		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		
		queue.dequeue();
		
		assertEquals(queue.front(),"3");
	}

}
