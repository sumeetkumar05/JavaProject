package loops;

import java.util.Scanner;

public class AdditionNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to add : ");
		int input = num.nextInt();
		int sum=0;
		for(int i=1;i<=input;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of N numbers are: "+ sum);
	}

}
