import java.util.*;

public class Arr_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] asciiValues = new int[size];
		System.out.println("Enter " + size + " ASCII values:");

		for (int i = 0; i < size; i++) {
			asciiValues[i] = sc.nextInt();
		}

		System.out.print("Corresponding characters: ");
		for (int val : asciiValues) {
			System.out.print((char) val + " ");
		}

		sc.close();
	}
}