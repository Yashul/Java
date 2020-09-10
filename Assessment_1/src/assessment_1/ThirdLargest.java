package assessment_1;

import java.util.*;

public class ThirdLargest {

	public static void thirdLargest(int[] arr) {
		if (arr.length < 3) {
			System.out.println("Invalid");
			return;
		}

		int largest = arr[0];
		int second_largest = Integer.MIN_VALUE;
		int third_largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				third_largest = second_largest;
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] > second_largest) {
				third_largest = second_largest;
				second_largest = arr[i];
			} else if (arr[i] > third_largest)
				third_largest = arr[i];
		}
		if (third_largest == second_largest || second_largest == largest)
			System.out.println("Invalid");
		else
			System.out.println("Third largest element: " + third_largest);
		;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		thirdLargest(arr);
		sc.close();
	}
}
