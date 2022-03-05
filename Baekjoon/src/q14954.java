import java.util.Scanner;
import java.util.HashSet;

public class q14954 {
	final static int div = 10;
	
	static int f(int n) {
		int res = 0;
		while(n>0) {
			res += (n%div)*(n%div);
			n /= div;
		}
		return res;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.close();
		boolean isHappy = true;
		set.add(n);
		while(n!=1) {
			n = f(n);
			if(set.contains(n)==true) {
				isHappy = false; break;
			}
			set.add(n);
		}
		
		String res = "";
		if(isHappy==true) res = "HAPPY";
		else res = "UNHAPPY";
		System.out.println(res);
	}
	
	
	/*static int[] dp;
	final static int div = 10;
	
	static int f(int n) {
		if(n==1) return -1;
		if(dp[n]!=-1) return -2;
		int res = 0;
		while(n>0) {
			res += (n%10)*(n%10);
			n /= div;
		}
		dp[n] = f(res);
		return dp[n];
	}
	
	public static void main(String[] args) {	//happy = -1, unhappy = -2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.close();
		dp = new int[1000];	Arrays.fill(dp,  -1);
		
		String res = "";
		if(f(n)==-2) res = "UNHAPPY";
		else if(f(n)==-1) res = "HAPPY";
		
		System.out.println(res);
	}
	*/
}
