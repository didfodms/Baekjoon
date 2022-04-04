import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11047 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coin = new int[n];
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());	
		}
		
		int count = 0;
		int index = n-1;
		while(true) {
			if(k==0) break;
			
			if(coin[index] <= k) {
				k -= coin[index];
				count++;
			}
			else {
				index--;
			}
		}
		
		System.out.println(count);
	}

}
