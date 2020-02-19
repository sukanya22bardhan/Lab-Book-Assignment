import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcSum {

	public static void main(String[] args) {
		CalcSum c = new CalcSum();
	    try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sum=c.calculateSum(n);
		sc.close();
		System.out.println("Sum: " + sum);
	    }catch(InputMismatchException e) {System.out.println("Enter a number please");}

	}

	private int calculateSum(int n)
	{
		int add=0;
		for(int i =1;i<=n;i++) {
			if(i%3==0 || i%5==0)
			{   
				System.out.println("adding: "+ i);
				add = add+i;
			}
		}
		return add;
		// TODO Auto-generated method stub
		
	}

}
