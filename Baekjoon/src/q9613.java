import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q9613 {
	
	//유클리드 호제법
	static int GCD(int a, int b) {
		if(b==0) return a;
		return GCD(b, a%b);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0) { //테스트 케이스
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] numbers = new int[n];
			
			for(int j=0; j<n; j++) {
				numbers[j] = Integer.parseInt(st.nextToken());
			}
			//int 범위 넘을수도 있다는거 항상 생각하기!
			long sum = 0;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					sum += GCD(numbers[i], numbers[j]);
				}
			}
			sb.append(sum+"\n");
		}
			
		System.out.println(sb.toString().trim());
	}

}
