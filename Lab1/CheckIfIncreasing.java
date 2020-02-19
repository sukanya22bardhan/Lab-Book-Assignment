import java.util.InputMismatchException;
import java.util.Scanner;


public class CheckIfIncreasing {

	public static void main(String[] args) 
	{
		CheckIfIncreasing d = new CheckIfIncreasing();
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		sc.close();
		boolean result=d.checkNumber(n);
		if(result== true)
		{
		System.out.println(n + " is an increasing number ");
		}
		else System.out.println(n + " is not an increasing number");
		}catch(InputMismatchException e) {System.out.println("Enter a number please");}

	}

	private boolean checkNumber(int n)
	{
		int flag = 0;
		String str = "" + n;
		int strlength = str.length();
		try{
			
        	for (int i = 0; i <strlength; i++)
	       	{

				if(str.charAt(i)>str.charAt(i+1))
				{
				  flag=0;
				  break;
				}
				else  flag++;
	    	}		
			
		   } catch (StringIndexOutOfBoundsException e) {}
			
		if(flag!=0) return true; 
		else return false;
	}
	
}
			
		



