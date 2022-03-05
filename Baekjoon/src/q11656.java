import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q11656 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] dic = new String[str.length()];
		
		for(int i=0; i<dic.length; i++) {
			dic[i] = str.substring(i, str.length());
		}
		
		Arrays.sort(dic);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<dic.length; i++) {
			sb.append(dic[i]+"\n");
		}
		System.out.println(sb.toString().trim());
	}

}
