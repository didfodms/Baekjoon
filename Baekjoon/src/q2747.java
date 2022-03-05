import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2747 {

	static int Fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return Fibo(n-1)+Fibo(n-2);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(Fibo(n));
	}
}
