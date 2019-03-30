package conditional;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binarynumber=0;
		int i=1;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter decimal number ");
		int input = num.nextInt();
		int input_init=input;
		while(input!=0)
		{
			binarynumber=binarynumber+(input%2)*i;
			input=input/2;
			i=i*10;
		}
		System.out.println("Decimal->Binary : "+input_init+"->"+binarynumber);

	}

}
