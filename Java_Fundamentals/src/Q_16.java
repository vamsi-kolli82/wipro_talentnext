
public class Q_16 {
	private static Boolean prime(int n) {
		int a = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				a= 1;
				break;
			}
		}
		if(a==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}

	}

}
