/**
 * @author kbenjabr 20 juil. 2017/12:11:01 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cap.defaultmethod.Engineer;

public class TestTriEngineer {
	public static void main(String[] args) {

		List<Engineer> listEngineers = getEngineers();
		/**
		 * comparaison selon l'age, on utilisant Collections.sort via un
		 * comparateur anonyme
		 */
		Collections.sort(listEngineers, new Comparator<Engineer>() {
			@Override
			public int compare(Engineer e1, Engineer e2) {
				return e1.getAge() - e2.getAge();
			}
		});
		System.out.println("Tri sans passage par expression lambda");
		for (Engineer developer : listEngineers) {
			System.out.println(developer);
		}

		/**
		 * comparaison selon l'age, on LAMBDAEXPRESSIONS (sans utilisation de
		 * Collections.sort le print aussi via LAMBDA Expression
		 */
		System.out.println("Tri et affichage en passant par lambdaExpression");
		listEngineers.sort((Engineer e1, Engineer e2) -> e1.getAge() - e2.getAge());
		listEngineers.forEach((engineer) -> System.out.println(engineer));

	}

	public static List<Engineer> getEngineers() {
		List<Engineer> result = new ArrayList<Engineer>();
		result.add(new Engineer("karim", 8000, 33));
		result.add(new Engineer("morad", 9000, 20));
		result.add(new Engineer("hicham", 5000, 10));
		result.add(new Engineer("imane", 7000, 55));
		return result;
	}
}
