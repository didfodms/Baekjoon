import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q9012 {
	static String res(String str) {
		int cnt = 0;
		for(char ch : str.toCharArray()) {
			if(ch=='(') {
				cnt++;
			} else if(ch==')') {
				cnt--;
			}
			if(cnt<0) return "NO";
		}
		if(cnt==0) return "YES";
		else return "NO";
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String str = br.readLine();
			bw.write(res(str)+"\n");
		}
		bw.flush();
	}
}
