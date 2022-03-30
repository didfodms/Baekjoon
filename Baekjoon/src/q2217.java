import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2217 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		int mm = 100000;
		for(int i=0; i<k; i++) {
			int w = Integer.parseInt(br.readLine());
			mm = mm < w? mm : w;
		}
		
		System.out.println(mm*k);
	}

}
