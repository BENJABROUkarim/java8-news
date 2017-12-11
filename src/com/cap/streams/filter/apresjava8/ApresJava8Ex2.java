/**
 * @author kbenjabr 11 déc. 2017/15:46:34 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.apresjava8;

import java.util.Arrays;
import java.util.List;

import com.cap.instance.Person;

public class ApresJava8Ex2 {

	public static void main(String[] args) {
		List<Person> listPerson = Arrays.asList(new Person("karim", 27), new Person("morad", 29),
				new Person("hamid", 30));

		Person person = listPerson.stream()
										  .filter(line -> "karim".equals(line.getNom()))
										  .findAny()
										  .orElse(null);

		System.out.println(person);
	}
}
