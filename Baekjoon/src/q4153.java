import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q4153 {
	
	static boolean isPytha(int[] t) {
		Arrays.sort(t);
		return (t[0]*t[0]+t[1]*t[1]==t[2]*t[2]);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		int[] tri = new int[3];
		Arrays.fill(tri, -1);
		while(!(tri[0]==0 && tri[1]==0 && tri[2]==0)) {
			str = br.readLine();
			String[] s = str.split(" ");
			for(int i=0; i<3; i++) {
				tri[i] = Integer.parseInt(s[i]);
			}
			
			if(isPytha(tri)) {
				if(tri[0]==0&&tri[1]==0&&tri[2]==0) break;
				sb.append("right\n");
			} else {
				sb.append("wrong\n");
			}
		}
		System.out.println(sb.toString().trim());
	}

}
