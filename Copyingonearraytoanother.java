package imp.Arrays;

import java.util.*;

public class Copyingonearraytoanother {
    public class CopyDynamicArray {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] originalArray = new int[size];
            int[] newArray = new int[size];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                originalArray[i] = sc.nextInt();
            }

            for (int i = 0; i < originalArray.length; i++) {
                newArray[i] = originalArray[i];
            }

            System.out.println("Original array: " + Arrays.toString(originalArray));
            System.out.println("New array: " + Arrays.toString(newArray));
        }
    }
}