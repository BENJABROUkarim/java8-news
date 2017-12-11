/**
 * @author kbenjabr 11 déc. 2017/16:07:18 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.apresjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.cap.instance.Person;

public class ApresJ8Ex2 {

	public static void main(String[] args) {
		List<Person> listPerson = Arrays.asList(new Person("karim", 27), new Person("morad", 29),
				new Person("hamid", 30));

		String name = listPerson.stream()
										.filter(line -> "morad".equals(line.getNom()))
										.map(Person::getNom)//concert stream to String
										.findAny()
										.orElse("");

		System.out.println(name);
		/**
		 * partie 2 : affichage de la liste
		 */
		List<String> listPeronne = listPerson.stream()
											  .map(Person::getNom)
											  .collect(Collectors.toList());
		
		listPeronne.forEach(System.out::println);
	}

}
