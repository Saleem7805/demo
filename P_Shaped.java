package StarProblem;

public class P_Shaped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<(n-1)/2  || i==(n-1)/2 && j<(n-1)/2
						|| j==(n-1)/2 && i<(n-1)/2 &&i>0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<(n-1)/2  || i==(n-1)/2 && j<(n-1)/2
						|| j==(n-1)/2 && i<(n-1)/2 &&i>0)
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
