
import java.util.*;

public class Arr_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int search = sc.nextInt();

		int index = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}

		System.out.println(index);

		sc.close();
	}
}
