package com.example.DemoTRain;

public class Dog2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		for (int i = 0; i < array.length; i++) {
			for(int j=0;j<array.length;j++)
			{
				for(int k=0;k<array.length;k++)
				{
					for(int l=0;l<array.length;l++)
					{
						if(array[i]!=array[j] && array[i]!=array[k] && array[i]!=array[l] && array[j]!=array[k] && array[j]!=array[l] && array[k]!=array[l])
						{
							System.out.println(array[i]+" "+array[j]+" "+array[k]+" "+array[l]);
						}
					}
				}
			}
		}

	}
}