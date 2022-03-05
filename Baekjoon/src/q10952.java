// 10952 빠른 입출력
// 어차피 경시대회에서는 입력량과 출력량이 큰 문제가 대부분이므로 
// 이런 입출력 패턴을 익혀두기 바란다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10952 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력을 위해
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());   // 한 줄 읽고
			int a = Integer.parseInt(st.nextToken());	// 줄 내에서 하나씩
			int b = Integer.parseInt(st.nextToken());
			if (a==0 && b==0) break;
			sb.append(a+b+"\n");		// StringBuilder에 모아놓고
		}	
		System.out.println(sb.toString());	// 모아 놓은 거 한번에 출력
	}
}