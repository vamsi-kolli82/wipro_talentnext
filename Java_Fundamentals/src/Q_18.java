import java.util.*;

public class Q_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n>0) {
			ans=ans*10+(n%10);
			n=n/10;
		}
		System.out.println(ans);
	}

}
