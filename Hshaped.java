package StarProblem;

public class Hshaped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<n;j++)
			{
				if( j==0 ||j==n-1 || i==(n-1)/2)
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
