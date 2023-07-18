package imp.Arrays;

import java.util.*;

public class Secondlargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter array size: ");
		int n = s.nextInt();
		System.out.println("enter array elements: ");
		int arr[] = new int[n];
		int large = 0;
		int seclarge = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (large < arr[i]) {
				seclarge = large;
				large = arr[i];
			} else if (seclarge < arr[i]) {
				seclarge = arr[i];
			}
		}
		System.out.println("the large value is: " + large);
		System.out.println("the second large value is: " + seclarge);

	}
}
