package stack;

import java.util.Scanner;

public class InfixToPostfix {

	//main function
	public static void main(String[] args) {
		
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		String infix = infixToPostfix.getStringfromUser("Infix");
		
		Postfix postfix = new Postfix(infix);
		System.out.println("PostFix = "+ postfix.getPostfix());

	}
	
	
	/**
	 * Method to read string data from standard input
	 * @param Name of variable to print 
	 * @return String value input by user
	 */
	public String getStringfromUser(String Name) {
		Scanner s= new Scanner(System.in);
		String string = "";		
		while(true) {
			try {
				System.out.println("Enter "+Name);
				string=s.next();
				if(string.length() > 0 ) {
					break;
				}
				else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
			finally {
				s.close();
			}
		}
		return string;
	}

}
