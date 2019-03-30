package conditional;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int octalnumber=0;
		int i=1;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter decimal number ");
		int input = num.nextInt();
		int input_init=input;
		while(input!=0)
		{
			octalnumber=octalnumber+(input%8)*i;
			input=input/8;
			i=i*10;
		}
		System.out.println("Decimal->Octal : "+input_init+"->"+octalnumber);
	}
}
