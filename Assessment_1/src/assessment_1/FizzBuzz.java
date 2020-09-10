package assessment_1;

import java.util.Scanner;

public class FizzBuzz {

	public static void fizzBuzz(int[] arr) {
		if (arr.length == 0)
			return;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 != 0)
				System.out.print("Fizz ");
			else if (arr[i] % 5 == 0 && arr[i] % 3 != 0) {
				System.out.print("Buzz ");
			} else if (arr[i] % 5 == 0 && arr[i] % 3 == 0)
				System.out.print("FizzBuzz ");
			else
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		fizzBuzz(arr);
		sc.close();
	}
}
