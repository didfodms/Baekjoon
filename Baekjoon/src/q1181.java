import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class q1181 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] word = new String[N];
		for(int i=0; i<N; i++) {
			word[i] = br.readLine();
		}
		
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int res = s1.length()-s2.length();
				if(res == 0) return s1.compareTo(s2);
				return res;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			if(i>0 && word[i].equals(word[i-1])) continue;
			sb.append(word[i]+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
