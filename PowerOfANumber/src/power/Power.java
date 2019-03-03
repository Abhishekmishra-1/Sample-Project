package power;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base and exponent: ");
		int base = in.nextInt();
		int exponent = in.nextInt();
		int result = PowerOfANumber(base,exponent);
		System.out.println("Power is: "+result);

	}
	public static int PowerOfANumber(int base,int exponent)
	{
		int power = 1;
		while(exponent>=1)
		{
			power = power * base;
			exponent--;
		}
		return power;
	}

}
