package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to add all Prime : ");
		int input = num.nextInt();
		int reverse=0;
		while(input!=0)
		{
			reverse=reverse*10+input%10;
			input=input/10;
		}
		System.out.println("Reverse of number is : "+ reverse);
		
	}

}
