package Exceptionday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started");
		// int a = 10;
		// int b = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide");
		}catch(InputMismatchException e) {
			System.out.println("invalid input format");
		}
		System.out.println("program completed");
	}

}
