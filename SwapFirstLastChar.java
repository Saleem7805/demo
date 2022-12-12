package com.Saleem.Strings;

public class SwapFirstLastChar {
	static String count(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while (i<ch.length && ch[i]!='')
			{
				i++;
				char temp=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=temp;
			}
			return new String(ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Kodnest is for freshers";
		System.out.println(count(str));

	}

}
