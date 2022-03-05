import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q20044 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] mem = new int[n*2];	int[] team = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<2*n; i++) {
			mem[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(mem);
		
		for(int i=0; i<n; i++) {
			team[i] = mem[i]+mem[n*2-1-i];
		}
		Arrays.sort(team);
		
		System.out.println(team[0]);
		
	}

}
