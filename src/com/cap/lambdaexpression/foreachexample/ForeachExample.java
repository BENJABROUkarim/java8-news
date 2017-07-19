/**
 * @author USER 18 juil. 2017/21:41:51 software engineer at Capgemini Morocco
 */
package com.cap.lambdaexpression.foreachexample;

import java.util.HashMap;
import java.util.Map;

public class ForeachExample {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("résultat parcours de map java version <= 7");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("résultat parcours de map java version 8");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count :" + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}

}
