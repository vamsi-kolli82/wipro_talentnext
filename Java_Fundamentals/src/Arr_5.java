
import java.util.*;
public class Arr_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n<2) {
			System.out.println("Enter 2 values");
		}
		int lag1=Integer.MIN_VALUE,lag2=Integer.MIN_VALUE;
		int sml1=Integer.MAX_VALUE,sml2=Integer.MAX_VALUE;
		for(int i:a) {
			if(lag1<i) {
				lag2=lag1;
				lag1=i;
			}
			if(lag2<i&&i!=lag1) {
				lag2=i;
			}
			
			if(sml1>i) {
				sml2=sml1;
				sml1=i;
			}
			if(sml2>i&&i!=sml1) {
				sml2=i;
			}
		}
		System.out.println(sml1+" "+sml2+" "+lag2+" "+" "+lag1);
	}

}
