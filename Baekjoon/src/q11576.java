import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11576 {

	static int to10(int A, int[] n) {
		int res = 0, dd = 1;
		
		for(int i=n.length-1; i>=0; i--) {
			res += n[i]*dd;
			dd *= A;
		}
		
		return res;
	}
	
	static String toB(int de, int B) {
		if(de==0) return "0";
		
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		int r = 0;
		
		while(de > 0) {
			r = de % B;
			de /= B;
			if(r >= 10) {
				sb.append(temp.append(" "+ r).reverse());
			} else {
				sb.append(r+" ");
			}
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		int[] number = new int[T];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<T; i++) {
			number[i] = Integer.parseInt(st.nextToken()); //string으로 A진수 받기
		}
		
		System.out.println(toB(to10(A, number), B).trim());
		
	}

}
