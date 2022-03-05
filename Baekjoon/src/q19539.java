import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q19539 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] h = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<h.length; i++) {
			h[i] = Integer.parseInt(st.nextToken())%3;
		}
		
		
		
	}

}
