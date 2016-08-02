package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void testDequeue() {
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		queue.enqueue(41);
		queue.enqueue(42);
		int x = (int) queue.dequeue();
		assertEquals(41, x);
		assertEquals(1, queue.getSize());
	}

	@Test
	public void testGetFront() {
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		queue.enqueue(41);
		queue.enqueue(42);
		int x = (int) queue.getFront();
		assertEquals(41, x);
	}

	@Test
	public void testMakeEmpty() {
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		queue.enqueue(41);
		queue.enqueue(42);
		assertEquals(false, queue.isEmpty());
		queue.makeEmpty();
		assertEquals(true, queue.isEmpty());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIsEmpty() {
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		assertEquals(true, queue.isEmpty());
		queue.dequeue();
	}

	@Test
	public void testGetSize() {
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		queue.enqueue(41);
		queue.enqueue(42);
		assertEquals(2, queue.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIsFull() {
		MyQueue<Integer> queue = new MyQueue<Integer>(2);
		queue.enqueue(41);
		queue.enqueue(42);
		assertEquals(true, queue.isFull());
		queue.enqueue(42);
	}

}
