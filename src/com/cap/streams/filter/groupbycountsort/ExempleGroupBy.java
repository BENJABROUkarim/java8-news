/**
 * @author kbenjabr 12 déc. 2017/14:26:13 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.groupbycountsort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExempleGroupBy {

	public static void main(String[] args) {
		List<String> listFawakih = Arrays.asList("apple", "banane", "orange", "apple", "papaya", "banane", "apple",
				"orrange");

		Map<String, Long> result = listFawakih.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
		// tri map et ajout a une map final
		Map<String, Long> finalMap = new LinkedHashMap<>();
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		System.out.println(finalMap);
	}

}
