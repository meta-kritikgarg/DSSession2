package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testPush() {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(25);
		stack.push(54);
		assertEquals(2, stack.getSize());
		int x = stack.getTop();
		assertEquals(54, x);
		stack.pop();
		x = stack.getTop();
		assertEquals(25, x);
	}

	
	@Test
	public void testPop() {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(25);
		stack.push(54);
		assertEquals(2, stack.getSize());
		
		int x = stack.getTop();
		assertEquals(54, x);

		 x = stack.pop();
		assertEquals(54, x);
		assertEquals(1, stack.getSize());
		stack.pop();
		stack.pop();
	}

}
