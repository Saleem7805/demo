package StarProblem;

public class Assgn_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x = 4;
	        for (int i = 1; i <= x; i++) {
	            for (int j = 1; j <= x; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	        System.out.println();

	        int n = 9;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            for (int j = 0; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < n; j++) {
	                if (i==n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            for (int j = 0; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < n; j++) {
	                if (i==0 || i==n-1 || j==0 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	            
		
	        }
		
	}

}


