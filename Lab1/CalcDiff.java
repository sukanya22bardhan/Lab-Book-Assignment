import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDiff {

	public static void main(String[] args) {
		CalcDiff d = new CalcDiff();
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int diff=d.calculateDifference(n);
		sc.close();
		System.out.println("Difference: " + diff);
		}catch(InputMismatchException e){System.out.println("Enter a number please");}


	}

	private int calculateDifference(int n)
	{
		int sq=0,ss=0, sum=0,result=0;
		
		for(int i=1;i<=n;i++)
		{
			 sq = (int) (sq +Math.pow(i, 2)); // stores the sum of squares
			 sum= sum + i;                   //  stores the sum of numbers from 1 to n
			 ss =(int) Math.pow(sum, 2);    //   stores the  square of sum
					 
			 result = sq-ss;
		}
		return result;
	}

}
