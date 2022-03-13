import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2525 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hh = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		
		hh += (mm+t)/60;
		hh %= 24;
		mm += t;
		mm %= 60;
		
		System.out.println(hh+" "+mm);
	}

}
