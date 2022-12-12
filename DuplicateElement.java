package com.ineuron;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,5,5,3,7,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j] +" ");
				}
			}
		}
		

	}

}
