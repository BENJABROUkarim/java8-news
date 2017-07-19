/**
 * @author kbenjabr 19 juil. 2017/16:39:32 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.rules;

public class TestRulesLambdaExpression {

	public static void main(String args[]) {
		TestRulesLambdaExpression tester = new TestRulesLambdaExpression();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// without parenthesis
		MessageService messageService1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		MessageService messageService2 = (message) -> System.out.println("Hello " + message);

		messageService1.sayMessage("Mahesh");
		messageService2.sayMessage("Suresh");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface MessageService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
