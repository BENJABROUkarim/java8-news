/**
 * @author kbenjabr 12 déc. 2017/14:51:39 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.streams.filter.groupbycountsort;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cap.instance.Item;

public class ExempleGroupSortCountItem {

	public static void main(String[] args) {

		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> reslut = items.stream().collect(Collectors.groupingBy(Item::getNom, Collectors.counting()));
		System.out.println(reslut);

		Map<String, Integer> resultSum = items.stream()
				.collect(Collectors.groupingBy(Item::getNom, Collectors.summingInt(Item::getQte)));
		System.out.println(resultSum);
		// group by price
		Map<BigDecimal, List<Item>> resultMapGroupByPrice = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice));
		System.out.println(resultMapGroupByPrice);
		
	}

}
