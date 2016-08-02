package stack;

public class MyStack<E> {
	MyLinkList<E> myStack;
	
	//Constructor 
	public MyStack() {
		myStack = new MyLinkList<E>();
	}
	
	
	/**
	 * To push an element in stack
	 * @param e
	 */
	public void push(E e) {
		myStack.add(e);
	}
	
	
	/**
	 * To pop an element from stack
	 * @return e
	 */
	public E pop() {
		int index = myStack.getSize()-1;
		if(index>=0) {
			E data= myStack.getByIndex(index);
			myStack.deleteAtPos(index);
			return data;
		}
		else {
			return null;
		}
	}
	
	
	/**
	 * To get size of stack
	 * @return int
	 */
	public int getSize() {
		return myStack.getSize();
	}
	
	
	/**
	 * To get the top element
	 * @return E
	 */
	public E getTop() {
		int index = myStack.getSize()-1;
		if(index>=0) {
			E data= myStack.getByIndex(index);
			return data;
		}
		else {
			return null;
		}
	}
	
}
