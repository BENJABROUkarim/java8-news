/**
 * @author kbenjabr 12 déc. 2017/14:09:54 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.mapexemple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExemple {

	public static void main(String[] args) {
		List<String> listAlpha = Arrays.asList("a", "b", "c", "d", "e");
		List<String> listAlphaUpperCase = new ArrayList<>();
		for (String str : listAlpha) {
			listAlphaUpperCase.add(str.toUpperCase());
		}
		System.out.println(listAlphaUpperCase);

		// convertion avec java 8
		List<String> listAlphaUpperCaseJava8 = listAlpha.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(listAlphaUpperCaseJava8);
		// autre exemple
		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listIntMultiple = listInt.stream().map(n -> n * 4).collect(Collectors.toList());
		System.out.println(listIntMultiple);
	}
	// convertion avec java 8
}
