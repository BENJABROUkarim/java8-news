/**
 * @author kbenjabr 8 d�c. 2017/14:43:56 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.foreachexample;

import java.util.HashMap;
import java.util.Map;

public class ForEachJava8LambdaExpression {

	public static void main(String[] args) {
		/**
		 * d�claration d'une map plus initialisation avec cl� chaine de
		 * caract�re et valeur comme entier
		 */
		Map<String, Integer> mapNom = new HashMap<>();
		mapNom.put("karim", 1);
		mapNom.put("morad", 2);
		mapNom.put("hicham", 3);
		mapNom.put("imane", 4);
		mapNom.put("amine", 5);
		// parcours avec java version avant <= 7
		System.out.println("r�sultat parcours de map java version <= 7");
		for (Map.Entry<String, Integer> entry : mapNom.entrySet()) {
			System.out.println(" cl� :" + entry.getKey() + "," + " valeur :" + entry.getValue());
		}
		// parcours map java 8
		System.out.println("-----------------------------------------------");
		System.out.println("r�sultat parcours de map java version 8");
		mapNom.forEach((k, v) -> System.out.println(" cl� :" + k + "," + " valeur :" + v));
	}

}
