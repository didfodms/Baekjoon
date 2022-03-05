import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10250 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int YY = 0, XX = 0; //YYXX
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			YY = N%H;
			XX = N/H + 1;
			
			if(YY==0) {
				YY = H; XX--;
			}
			sb.append(YY);
			if(XX < 10) sb.append("0");
			sb.append(XX+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
