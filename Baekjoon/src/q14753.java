import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q14753 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		int[] cardM = new int[n];
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		int max = card[0]*card[1]; //À½ x À½
		max = Math.max(max, card[n-1]*card[n-2]);
		max = Math.max(max, card[n-1]*card[n-2]*card[n-3]);
		max = Math.max(max, card[n-1]*card[0]*card[1]);
		
		System.out.println(max);
		
	}

}
