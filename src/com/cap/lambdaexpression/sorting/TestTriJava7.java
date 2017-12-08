/**
 * @author kbenjabr 8 d�c. 2017/15:01:49 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.lambdaexpression.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cap.instance.Developpeur;

public class TestTriJava7 {
	public static void main(String[] args) {
		// 1- r�cup�ration d'une liste de d�veloppeur
		List<Developpeur> items = getDeveloppeur();

		System.out.println("avant le tri");
		for (Developpeur developpeur : items) {
			System.out.println(developpeur);
		}
		System.out.println("----------------------------------------------");
		System.out.println("tri selon l'age");
		Collections.sort(items, new Comparator<Developpeur>() {
			@Override
			public int compare(Developpeur o1, Developpeur o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		// affichage
		System.out.println("affichage du tri");
		for (Developpeur developpeur : items) {
			System.out.println(developpeur);
		}

		// m�thode d'initialisation d�veloppeur

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
