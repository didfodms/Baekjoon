import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q10808 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] countAlpha = new int[27];
		for(int i=0; i<str.length(); i++) {
			countAlpha[str.charAt(i)-97]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++) {
			sb.append(countAlpha[i]+" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
