import java.util.*;
public class Q_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int ans=0;
		while(n>0) {
			ans=ans*10+(n%10);
			n=n/10;
		}
		if(n1==ans) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
