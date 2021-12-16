package com.example.DemoTRain;

public class Employee
{
	public static void main(String[] args) {
		String str="PERFICIENT";
	//	str.indexOf(ch, fromIndex);
		char temp = 0;
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			for(int j=str.indexOf(c)+1;j<str.length();j++)
			{
				if(c==str.charAt(j))
				{
					temp=str.charAt(j);
					break;
				}
			}
			System.out.println(temp);
		}
		
	}
}
	