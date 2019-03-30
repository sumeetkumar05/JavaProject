package loops;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to add digits : ");
		int input = num.nextInt();
		int sum=0;
		while(input!=0)
		{
			sum=sum+input%10;
			input=input/10;
		}
		System.out.println("sum of digits are: "+ sum);
	}

}
