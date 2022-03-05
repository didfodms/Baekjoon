import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11005 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		//인덱스 : 숫자, 엘리먼트 : 숫자+알파벳
		char[] n = new char[36];
		for(int i=0; i<n.length; i++) {
			if(i < 10) n[i] = (char)(i+48);
			else n[i] = (char)(i+55);
		}
		//10진법 -> B진법
		int r = 0;
		StringBuilder sb = new StringBuilder();
		while(N > 0) {
			r = N % B;
			sb.append(n[r]);
			N /= B;
		}
		
		System.out.println(sb.reverse().toString());
		
	}

}
