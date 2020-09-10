package assessment_1;

import java.util.Scanner;

public class DuplicateElements {

	public static void printDuplicate(int[] arr) {
		if (arr.length == 0)
			return;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[j] + " ");
			}
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
		printDuplicate(arr);
		sc.close();
	}
}
