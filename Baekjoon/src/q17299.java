import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q17299 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[k];
		int[] AN = new int[k];
		int[] res = new int[k];
		int[] cnt = new int[1000001];
		for(int i=0; i<k; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			cnt[A[i]]++;
		}
		//문제 분할... 수열의 등장 횟수만 출력하기
		//ex) 1 1 2 3 4 2 1 => 3 3 2 1 1 2 3
		for(int i=0; i<k; i++) {
			AN[i] = cnt[A[i]];
		}
		
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<k; i++) {
			while(!s.empty() && AN[s.peek()] < AN[i]) {
				res[s.peek()] = A[i];
				s.pop();
			}
			s.push(i);
		}
		
		while(!s.empty()) {
			res[s.pop()] = -1;
		}
		
		for(int i=0; i<k; i++) {
			sb.append(res[i]+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
