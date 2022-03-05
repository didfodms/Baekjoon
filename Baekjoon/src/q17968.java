import java.util.Scanner;

public class q17968 {
	
	static int[] A = new int[1000];
	
	/*static int cal(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		int res = 1;
		for(int i=1; n-2*i>=0; i++) {
			if(A[n]-A[n-i]==A[n-i]-A[n-2*i]) res++;
			else break;
		}
		return res;
	}*/
	
	static int cal(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		int res = 1;
		for(int i=1; n-2*i>=0; i++) {
			if(cal(n)-cal(n-i)==cal(n-i)-cal(n-2*i)) res++;
			else break;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	sc.close();
		
		System.out.println(cal(n));
	}
}
