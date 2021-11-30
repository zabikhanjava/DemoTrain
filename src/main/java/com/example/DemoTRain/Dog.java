package com.example.DemoTRain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Animal {

	
}
public class Dog extends Animal {
	
	
	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("DAMIEN L");
		list2.add("ASHOK D");
		list2.add("FARHAN J");
		list2.add("HRUDAY K");
		list2.add("GABRIEL W");
		ArrayList<String> list1=new ArrayList<String>();
		list2.add("ASHOK D");
		list2.add("BHASKAR N");
		list2.add("CHARAN S");
		list2.add("EMILEE N");
		list2.add("HRUDAY K");
		
		list1.addAll(list2);
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<list1.size();i++)
		{
			if(map.containsKey(list1.get(i)))
			{
				map.put(list1.get(i), map.get(list1.get(i))+1);
			}
			else
			{
				map.put(list1.get(i), 1);
			}
		}
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	
}