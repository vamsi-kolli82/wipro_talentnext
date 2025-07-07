

import java.util.*;

public class Arr_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}