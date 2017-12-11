/**
 * @author kbenjabr 8 déc. 2017/16:13:49 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.apresjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApresJava8 {

	public static void main(String[] args) {
		List<String> listNom = Arrays.asList("morad", "karim", "hicham");

		List<String> list = listNom.stream() //convert list to stream
											.filter(line -> !"karim".equals(line))//filtrer karim
											.collect(Collectors.toList());//collect the output and
																			// convert the stream to 
																			// a new list
		
		list.forEach(System.out::println);

	}

}
