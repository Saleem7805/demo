package StarProblem;

public class INEURON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<n;j++)
			{
				if( i==0 ||j==2 || i==n-1) // I printing
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)//column
			{
				if(j==0 || j==n-1 ||i==j) //N printing
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)//column
			{
				if(i==0  || i==(n-1)/2 || i==n-1 || j==0 ) //E printing
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)//column // U printing
			{
				if(j==0 || i==n-1 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)     // R printing
			{
				if(j==0 || i==0 && j<(n-1)/2  || i==(n-1)/2 && j<(n-1)/2
						|| j==(n-1)/2 && i<(n-1)/2 &&i>0 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");	
			for(int j=0;j<n;j++)//column // O printing
			{
				if(j==0 || i==0  || j==n-1 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)//column
			{
				if(j==0 || j==n-1 ||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}

		

	}
}


