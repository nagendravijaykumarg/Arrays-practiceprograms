package imp.Arrays;

import java.util.*;

public class Totalevenorodd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values into array");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int count1 = 0, count2 = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				count1++;
			} else if (arr[i] % 2 != 0) {
				count2++;
			}
		}
		System.out.println("No.of even elements in array: " + count1);
		System.out.println("No.of Odd elements in array: " + count2);
	}
}