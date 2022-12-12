package StarProblem;

public class Saleem_Shaped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<n;j++)//column
			{
				if((i==0) ||(j>(n-1)/2 || j<(n-1)/2)  || (i==(n-1)/2)|| 
						( j==0 && i>0) || (i==0 && j>0 && j<n||i==(n-1)/2 && j<=(n-1)/2) ||j==(n-1)
						|| j==0 || i==n-1
						|| i==1 ||  j==n/2 || i==3 || i==5
						|| i==1 ||  j==n/2 || i==3 || i==5
						|| j==0 || j==n-1 ||i/2==j/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
