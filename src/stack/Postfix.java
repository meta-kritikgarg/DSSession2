package stack;

public class Postfix {
	
	String input;
	String output= "";
	MyStack<Character> charStack;
	
	public Postfix(String input) {
		charStack = new MyStack<Character>();
		this.input = input;
	}
	
	
	public String getPostfix() {
		 for (int j = 0; j < input.length(); j++) {
	         char ch = input.charAt(j);
	         String tmp = "";
	         switch (ch) {
	            case '+': 
	            case '-':
	            tmp = getOperator(ch); 
	            break; 
	            case '*': 
	            case '/':
	            tmp = getOperator(ch); 
	            break; 
	            case '(': 
	            charStack.push(ch);
	            break;
	            case ')': 
	            tmp = getAll();
	            break;
	            default: 
	            tmp = String.valueOf(ch);
	            break;
	         }
	         output = output + tmp; 
		 }
		 output= output+getAll();
		 if(charStack.getTop()!=null) {
			 output = "Invalid Expression";
		 }
		 return output;
	}
		 
	
	public String getOperator(char currentOP) {
		String output = "";
		if(charStack.getTop()==null) {
			charStack.push(currentOP);
			return output;
		}

		if(prec(charStack.getTop()) < prec(currentOP) ) {
			charStack.push(currentOP);
		}
		else {
			output = String.valueOf(charStack.pop());
			charStack.push(currentOP);
		}
		return output;
	}
	
	
	public String getAll() {
		String tmp = "";
		while (charStack.getTop()!=null) {
			if(charStack.getTop()=='(') {
				charStack.pop();
				break;
			}
			tmp=tmp+charStack.pop();
		}
		
		return tmp;
	}
	
	
	private int prec(char x) {
			if(x=='+'||x=='-') {
				return 1;
			}
			
			if(x=='*'||x=='/') {
				return 2;
			}
			return 0;
	}
	
}
