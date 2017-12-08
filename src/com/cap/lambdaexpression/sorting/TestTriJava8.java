/**
 * @author kbenjabr 8 déc. 2017/15:26:09 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.sorting;

import java.util.ArrayList;
import java.util.List;

import com.cap.instance.Developpeur;

public class TestTriJava8 {

	public static void main(String[] args) {
		// 1- récupération d'une liste de développeur
		List<Developpeur> items = getDeveloppeur();

		System.out.println("tri en utilisant lambda expression");
		items.sort((Developpeur d1, Developpeur d2) -> d1.getAge() - d2.getAge());

		System.out.println("affichage du tri utilisant lambda expression");
		items.forEach(developpeur -> System.out.println(developpeur));

	}

	private static List<Developpeur> getDeveloppeur() {
		List<Developpeur> developpeurs = new ArrayList<>();
		developpeurs.add(new Developpeur(26, "karim"));
		developpeurs.add(new Developpeur(40, "morad"));
		developpeurs.add(new Developpeur(31, "hicham"));
		developpeurs.add(new Developpeur(28, "amine"));
		return developpeurs;

	}

}
