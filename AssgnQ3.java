package StarProblem;

public class AssgnQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<n;j++)
			{
				if( i==0 ||j==n-1 || j==0 || i==n-1)
				{
					System.out.print("*");
				}
				else if(i==1 && j!=6)
				{
					System.out.print("*");
				}
				else if(i==2 && j!=5 && j!=6 && j!=7)
				{
					System.out.print("*");
				}
				else if(i==3 && j!=4 && j!=5 && j!=6 && j!=7 && j!=8)
				{
					System.out.print("*");
				}
				else if(i==4 && j!=3 && j!=4 && j!=5 && j!=6 && j!=7 && j!=8 && j!=9)
				{
					System.out.print("*");
				}
				else if(i==5 && j!=2 && j!=3 && j!=4 && j!=5 && j!=6 
						&& j!=7 && j!=8 && j!=9 && j!=10)
				{
					System.out.print("*");
				}
				else if(i==6 && j!=1 && j!=2 && j!=3 && j!=4 && j!=5 && j!=6 
						&& j!=7 && j!=8 && j!=9 && j!=10 && j!=11)
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
