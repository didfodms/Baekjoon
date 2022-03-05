import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q1920 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<Integer> A = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		int M = Integer.parseInt(br.readLine());
		int[] n = new int[M];	//찾아야 하는 숫자
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		//출력
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			if(A.contains(n[i])) sb.append("1\n");
			else sb.append("0\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
