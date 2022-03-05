import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q11721 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Character> q = new LinkedList<>();
		String input = br.readLine();
		char[] c = input.toCharArray();
		for(int i=0; i<c.length; i++) {
			sb.append(c[i]);
			if((i+1)%10==0) sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
