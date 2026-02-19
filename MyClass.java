package projectdavid;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args){		
        
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number between 3 and 20: ");
		int number = scanner.nextInt();
		
		while (number < 3 || number > 20) {
			System.out.println("Invalid input.");
			number = scanner.nextInt();
		}
		System.out.println();
		System.out.printf("%4s", "+");
		for (int i = 1; i <= number; i++) {
			System.out.printf("%4d", i);			
		}
		System.out.println();
		for (int row = 1; row <= number; row++) {
			System.out.printf("%4d", row);
			
			for(int col = 1; col <= number; col++) {
				System.out.printf("%4d", row + col);
			}
			System.out.println();
		}
	
		scanner.close();
	}
}



