import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10430 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		sb.append((A+B)%C+"\n"+((A%C) + (B%C))%C+"\n"+(A*B)%C+"\n"+ ((A%C)*(B%C))%C);
		System.out.println(sb.toString());
	}

}
