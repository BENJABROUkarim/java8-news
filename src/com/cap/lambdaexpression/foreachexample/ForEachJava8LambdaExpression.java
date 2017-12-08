/**
 * @author kbenjabr 8 déc. 2017/14:43:56 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.foreachexample;

import java.util.HashMap;
import java.util.Map;

public class ForEachJava8LambdaExpression {

	public static void main(String[] args) {
		/**
		 * déclaration d'une map plus initialisation avec clé chaine de
		 * caractère et valeur comme entier
		 */
		Map<String, Integer> mapNom = new HashMap<>();
		mapNom.put("karim", 1);
		mapNom.put("morad", 2);
		mapNom.put("hicham", 3);
		mapNom.put("imane", 4);
		mapNom.put("amine", 5);
		// parcours avec java version avant <= 7
		System.out.println("résultat parcours de map java version <= 7");
		for (Map.Entry<String, Integer> entry : mapNom.entrySet()) {
			System.out.println(" clé :" + entry.getKey() + "," + " valeur :" + entry.getValue());
		}
		// parcours map java 8
		System.out.println("-----------------------------------------------");
		System.out.println("résultat parcours de map java version 8");
		mapNom.forEach((k, v) -> System.out.println(" clé :" + k + "," + " valeur :" + v));
	}

}
