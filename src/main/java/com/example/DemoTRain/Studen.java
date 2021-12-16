package com.example.DemoTRain;

import java.util.Arrays;
import java.util.List;

public class Studen {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(12,34,3);
		int sum =s.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
