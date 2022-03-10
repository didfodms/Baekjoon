import java.util.Scanner;

public class q14920 {

	static int cnt = 0;
	
	static int C(int n) {
		cnt++;
		if(n==1) return cnt;
		
		if(n%2==0) return C(n/2);
		return C(3*n+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(C(n));
	}

}
