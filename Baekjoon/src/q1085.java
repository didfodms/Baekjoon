import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1085 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int minW = x<w-x?x:w-x;
		int minH = y<h-y?y:h-y;
		int min = minW<minH?minW:minH;
		
		System.out.println(min);
	}
}
