import java.util.Scanner;
import java.util.Stack;

public class DataStructures2 {

	public static void main(String[] args) {
		int result = 0;
		int x;
		int y;
		Stack<Integer> s = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three one digit numbers and two operations.");
		String userInput = scan.nextLine();
		// 1. read the user input
		char c = 0;
		for (int i = 0; i < userInput.length(); i++) {
			c = userInput.charAt(i);
			// for loop that goes over the characters one at a time
			// translate char to integers

			if (c >= '0' && c <= '9') {
				//if the char is is a number we will push it the stack below
				
				int number = Character.getNumericValue(c);
				//convert the char to an integer
				s.push(number);	
			}
			//In the case of each operation, the first two numbers will pop out of the stack
			switch (c) {
			case '*':
				x = s.pop();
				y = s.pop();
				result = x * y;
				s.push(result);
				break;
			case '+':
				x = s.pop();
				y = s.pop();
				result = x + y;
				s.push(result);
			break;
			case '-':
				x = s.pop();
				y = s.pop();
				result = y - x;
				//y must come first because it is first in the stack
				s.push(result);
			break;
			case '/':
				x = s.pop();
				y = s.pop();
				result = y/x;
				//y must come first because it is first in the stack
				s.push(result);
			break;
			}
		}
		System.out.println("The result is " + result + ".");
		scan.close();
		//Push whole project
	}
}
