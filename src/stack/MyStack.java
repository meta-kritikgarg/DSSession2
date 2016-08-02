package stack;

public class MyStack<E> {
	MyLinkList<E> myStack;
	
	public MyStack() {
		myStack = new MyLinkList<E>();
	}
	
	
	public void push(E e) {
		myStack.add(e);
	}
	
	
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
	
	
	public int getSize() {
		return myStack.getSize();
	}
	
	
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
