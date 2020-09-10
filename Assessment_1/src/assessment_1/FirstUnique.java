package assessment_1;

import java.util.Scanner;

public class FirstUnique {

	public static void firstUnique(int[] arr) {
		if(arr.length==0)
			return;
		for(int i=0; i<arr.length; i++) {
			int j;
			for(j=0; j<arr.length; j++) {
				if(i!=j && arr[i]==arr[j]) 
					break;
			}
			if(j==arr.length)
				System.out.print(arr[i]);
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
		firstUnique(arr);
		sc.close();
	}
}
