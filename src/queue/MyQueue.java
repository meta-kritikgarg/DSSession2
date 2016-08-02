package queue;

public class MyQueue<E> {
	
	private Object[] data;
	int size;
	int back;
	int front;
	
	public MyQueue(int size) {
		if( size < 0 ){
			throw new IllegalArgumentException("Illegal Size: "+size);
		}
		data = new Object[size];
		back = -1;
		front = 0;
		this.size = 0;
	}
	
	
	/**
	 * Method to add an item to queue
	 * @param item
	 */
	public void enqueue(E e){
		if (isFull()) {
			throw new IndexOutOfBoundsException("Queue Overflow");
		}
		back = (back+1)%data.length;
		data[back] = e;
		size++;
	}
	
	
	/**
	 * Method to removes an item from the front of the queue
	 * @return If queue is empty returns null
	 */
	public Object dequeue(){
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Queue UnderFlow ");
		}
		Object tmp =  data[front];
		front = (front+1) % data.length;
		size--;
		return tmp;
	}
		
	
	public Object getFront() {
		if (isEmpty()) {
			   return null;
		}
		Object tmp =  data[front];
		return tmp;
	}
		
	
	/**
	 * Method to makes the queue empty
	 */
	public void makeEmpty() {
		front = 0;
		back = -1;
		size=0;
	}
	
	
	/**
	 * @return true if the queue is empty else false
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	
	/**
	 * @return size of queue
	 */
	public int getSize() {
		return size;
	}
	
	
	/**
	 * @return Returns true if the queue is full, false otherwise.
	 */
	public boolean isFull() {
		return size == data.length;
	}
}
