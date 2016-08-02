package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixTest {

	@Test
	public void testGetPostfix() {
		Postfix testData = new Postfix("q*s+t");
		assertEquals("qs*t+", testData.getPostfix());
		
		testData = new Postfix("q*(s+t)");
		assertEquals("qst+*", testData.getPostfix());
		
		testData = new Postfix("(A+B)*(C+D)");
		assertEquals("AB+CD+*", testData.getPostfix());
		
		testData = new Postfix("A*B+C*D");
		assertEquals("AB*CD*+", testData.getPostfix());
		
		testData = new Postfix("a+b(-c+d*e");
		assertEquals("Invalid Expression", testData.getPostfix());
	}
}
