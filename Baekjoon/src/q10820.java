import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q10820 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] res = new int[100][4];
		
		String str = new String();
		int index = 0;
		while((str = br.readLine()) != "" || str!=null) { //BufferedReader啊 EOF阑 贸府窍绰 规过
			int[] A = new int[4];
			for(int i=0; i<str.length(); i++) {
				if(97 <= str.charAt(i) && str.charAt(i) >= 102) {
					A[0]++;
				}
				else if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
					A[1]++;
				}
				else if(Character.isDigit(str.charAt(i))) {
					A[2]++;
				}
				else if(str.charAt(i)==' ') {
					A[3]++;
				}
			}
			res[index++] = A;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<index; i++) {
			for(int j=0; j<res[i].length; j++) {
				sb.append(res[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
