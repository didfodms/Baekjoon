import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q23841 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] ch = new char[N][M];
		for(int i=0; i<N; i++) {
			ch[i] = br.readLine().toCharArray();	
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(65<=ch[i][j] && ch[i][j]<=90) {
					ch[i][(M-1)-j] = ch[i][j];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sb.append(ch[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
