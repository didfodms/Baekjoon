import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q11497 {

	static int[] t(int[] h, int N) {
		
		int[] arr = new int[N];
		int index = 0;
		for(int i=0; i<N; i++) {
			while(index < N) {
				arr[i] = h[index];
				i++; index += 2;
			}
			
			if(N%2==0) index -= 1;
			else index -= 3;
			
			while(index > 0) {
				arr[i] = h[index];
				i++; index -= 2;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] h = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				h[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(h);
			int[] arr = new int[N];
			arr = t(h, N);
			
			int mm = Math.abs(arr[N-1]-arr[0]);
			for(int i=1; i<N; i++) {
				int dif = Math.abs(arr[i]-arr[i-1]);
				mm = Math.max(mm, dif);
			}
			
			sb.append(mm+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
