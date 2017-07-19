/**
 * @author kbenjabr 19 juil. 2017/16:39:32 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.rules;

public class TestRulesLambdaExpression {

	// avec le type de déclaration
	MathOperation addition = (int a, int b) -> a + b;

	// sans type de déclaration
	MathOperation subtraction = (a, b) -> a - b;

}
