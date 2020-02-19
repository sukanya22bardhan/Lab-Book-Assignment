import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIfPower {

	public static void main(String[] args) {
	
		CheckIfPower c = new  CheckIfPower();
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		boolean result =c.checkNumber(n);
		if(result==true) {System.out.println(n + " is a power of 2");}
		else System.out.println(n + " is not a power of 2");
		}catch(InputMismatchException e) {System.out.println("Please enter numbers only");}
	}

	private boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;

		
	}

}
