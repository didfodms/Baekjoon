import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1934 {
	//유클리드 호제법
	static int GCD(int a, int b) {
		if(b==0) return a;
		else return GCD(b, a%b);
	}
	//a * b = GCD * LCM
	static int LCM(int a, int b) {
		return (a*b)/GCD(a, b);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(LCM(a, b)+"\n");
		}
		System.out.println(sb.toString());
		
	}

}
