package imp.Arrays;

import java.util.*;

public class Counthefrequencyofeac {
    public class CountFrequency {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int[] visited = new int[size];
            int count;

            for (int i = 0; i < size; i++) {
                count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = 1;
                    }
                }
                if (visited[i] != 1) {
                    visited[i] = 1;
                    System.out.println(arr[i] + " occurs " + count + " times.");
                }
            }
        }
    }
}