import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17362 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int res = n % 8;
		if(res == 0) res = 8;
		if(res > 5) res = 10-res;
		
		System.out.println(res);
		
	}

}
