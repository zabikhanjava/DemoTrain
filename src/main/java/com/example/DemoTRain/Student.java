package com.example.DemoTRain;

import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		List<stdent1> pop=new ArrayList<stdent1>();
		stdent1 s=new stdent1(90,"zabi");
		stdent1 s1=new stdent1(46,"aabba");
		pop.add(s);
		pop.add(s1);
		System.out.println(pop);
		stdComparator ss=new stdComparator();
		List some=pop.stream().sorted(ss).collect(Collectors.toList());;
		Optional<stdent1> sssss=pop.stream().max(ss);
		if(sssss.isPresent())
		{
			System.out.println(sssss.get());
		}
		
		System.out.println(some);
		HashMap<String, Integer> po=new HashMap<String, Integer>();
		po.put("some", 90);
		po.put("khan", 1);
		po.put("paan", 10);
		po.put("daan", 2);
		HashMap<String,Integer> map=po.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e2, LinkedHashMap<String, Integer>::new));
		for(Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey());
		}
	}

}

class stdent1 {
	int id;
	String name;

	public stdent1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "stdent1 [id=" + id + ", name=" + name + "]";
	}

}

class stdComparator implements Comparator<stdent1> {

	@Override
	public int compare(stdent1 o1, stdent1 o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}