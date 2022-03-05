import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q20041 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = sc.nextInt();
		int px[] = new int[n]; int py[] = new int[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			px[i] = Integer.parseInt(st.nextToken());
			py[i] = Integer.parseInt(st.nextToken());
		}
		

	}

}
