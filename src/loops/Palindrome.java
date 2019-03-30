package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse="";		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your input to check Palindrome: ");
		String input=num.nextLine();
		for(int count=input.length()-1;count>=0; count--)
		{
		 reverse=reverse+input.charAt(count);
		}
		if(input.equals(reverse))
		{
			System.out.println("Input value is Palindrome");
		}
		else
			System.out.println("Input value is not Palindrome");
	}

}
