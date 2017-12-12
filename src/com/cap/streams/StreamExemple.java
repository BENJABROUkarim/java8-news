/**
 * @author kbenjabr 11 déc. 2017/12:03:56 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExemple {

	public static void main(String[] args) {
		List<String> listOfAnimals = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");
		listOfAnimals.stream()
							  //filtrage
							  .filter(line -> line.contains("cha"))
							  
							  //mapping reformatage des chaines de caractère
							  .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
							  
							  // Tri par ordre alphabétique
							  .sorted()
							  .forEach(System.out::println);
	}

}
