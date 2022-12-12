package com.Saleem.Strings;

public class ReverseStringWithPreservingSpace {
	static void reverseString(String inputString)
	{
		char[] inputStringArray=inputString.toCharArray();
		char[] resultArray=new char[inputStringArray.length];
		for(int i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]=='')
			{
				resultArray[i]='';
			}
		}
		int j=resultArray.length-1;
		for(int i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]!='')
			{
				if(resultArray[j]=='')
				{
					j--;
				}
			}
		}
	}

}
