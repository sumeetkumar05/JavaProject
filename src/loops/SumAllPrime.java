package loops;

import java.util.Scanner;

public class SumAllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to add all Prime : ");
		int input = num.nextInt();
		int sum=0;
		if(input>2)
		{
			for(int i=2;i<=input;i++)
			{
				for(int k=2;k<i;k++)
				{
					if(i%k==0)
					{
						flag=false;
						break;
					}
				}
				if(flag==true)
				{
					sum=sum+i;
				}
				flag=true;
			}
		}
//		else if(input==1)
//			sum=1;
//		else if(input==2)
//			sum=3;
		else
			System.out.println("Invalid Input");
		
		System.out.println("Sum of Prime numbers: "+sum);
	}

}
