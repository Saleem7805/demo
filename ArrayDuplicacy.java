package com.ArrayConcept.Array;

public class ArrayDuplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HII RAJU I AM FINE RAJU";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[i]);
				}
			}
		}

	}

}
