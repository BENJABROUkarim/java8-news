/**
 * @author kbenjabr 8 déc. 2017/15:56:43 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvantJava8 {

	public static void main(String[] args) {
		List<String> listNom = Arrays.asList("morad", "karim", "hicham");
		List<String> filterList = getFilterOutput(listNom, "karim");
		for (String out : filterList) {
			System.out.println(out);
		}
	}

	// création d'une méthode statique de filtrage d'une chaine de caractère
	private static List<String> getFilterOutput(List<String> list, String chaine) {
		List<String> result = new ArrayList<>();
		for (String string : list) {
			if (!chaine.equals(string)) {
				result.add(string);
			}
		}
		return result;
	}

}
