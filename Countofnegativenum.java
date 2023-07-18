package imp.Arrays;

import java.util.*;

public class Countofnegativenum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values into array");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		System.out.println("count of Negative values in array : " + count);
	}
}