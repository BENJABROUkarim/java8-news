/**
 * @author kbenjabr 20 juil. 2017/13:56:44 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.methodreferences;

import java.util.List;

import com.cap.defaultmethod.Engineer;
import com.cap.lambdaexpression.rules.TestTriEngineer;

public class TestMethodeReference {
	public static void main(String[] args) {
		List<Engineer> listEngineers = TestTriEngineer.getEngineers();

		/**
		 * affichage avec référence de méthode
		 */
		System.out.println("en utilisant la référence à une méthode");
		listEngineers.forEach(System.out::println);
	}
}
