import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q10203 {

	static int Vowels(String str) {
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				sum++;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String str = "";
		while(T-- > 0) {
			str = br.readLine();
			sb.append("The number of vowels in "+ str + " is "+ Vowels(str) + ".\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
