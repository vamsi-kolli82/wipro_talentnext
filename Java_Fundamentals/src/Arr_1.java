import java.util.*;

public class Arr_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + sum / n);
		sc.close();

	}

}
