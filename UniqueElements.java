package imp.Arrays;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] uniqueArr = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                boolean alreadyAdded = false;
                for (int k = 0; k < uniqueCount; k++) {
                    if (uniqueArr[k] == arr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    uniqueArr[uniqueCount] = arr[i];
                    uniqueCount++;
                }
            }
        }

        System.out.print("The unique elements in the array are: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}