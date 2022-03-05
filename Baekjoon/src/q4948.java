import java.util.Scanner;

public class q4948 {

	static int isPrime(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		for(int i=2; i<n; i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
	
	static int count(int n) {
		int cnt = 0;
		for(int i=n+1; i<=2*n; i++) {
			cnt += isPrime(i);
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[100001];
		
		int i=0;
		do {
			n[i] = sc.nextInt();
			i++;
		} while(n[i-1]!=0);
		sc.close();
		
		for(int j=0; j<i-1; j++) {
			System.out.println(count(n[j]));
		}
	}
}
