import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q5086 {

	static boolean isFactor(int a, int b) {
		return (b % a == 0);
	}
	
	static boolean isMultiple(int a, int b) {
		return (a % b == 0);
	}
	
	static String Relation(int a, int b) {
		if(isFactor(a, b)) return "factor";
		if(isMultiple(a, b)) return "multiple";
		return "neither";
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) break;
			
			sb.append(Relation(a, b)+"\n");
		}

		System.out.println(sb.toString().trim());
		
	}

}
