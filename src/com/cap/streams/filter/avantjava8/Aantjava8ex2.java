/**
 * @author kbenjabr 11 déc. 2017/15:38:22 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.avantjava8;

import java.util.Arrays;
import java.util.List;

import com.cap.instance.Person;

public class Aantjava8ex2 {

	public static void main(String[] args) {

		List<Person> listPerson = Arrays.asList(new Person("karim", 27), new Person("morad", 29),
				new Person("hamid", 30));

		Person person = getStudentByName(listPerson, "karim");
		System.out.println(person);
	}

	private static Person getStudentByName(List<Person> listPerson, String nom) {

		Person result = null;
		for (Person person : listPerson) {
			if (nom.equals(person.getNom())) {
				result = person;
			}
		}
		return result;

	}

}
