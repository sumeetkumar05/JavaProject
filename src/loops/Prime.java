package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		boolean flag = true;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to check Prime ");
		String input = num.nextLine();
		try {
			num1 = Integer.parseInt(input);
			for (int i = 2; i <= num1 / 2; i++) {
				if (num1 % i == 0) {
					System.out.println(num1 + " is not prime Number");
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println(num1 + " is prime Number");
			}
		} catch (Exception E) {
			System.out.println("Entered incorrect Number format " + E.toString());
		}

	}

}
