import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q20926 {

	public static void main(String[] args) throws Exception {
		final int
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[][] map = new int[W][H];
		String str = "";
		
		for(int i=0; i<W; i++) {
			str = br.readLine();
			for(int j=0; j<H; j++) {
				if(str.charAt(j)=='T') map[i][j] = -1;
				else if(str.charAt(j)=='R') map[i][j] = -2;
				else if(str.charAt(j)=='H') map[i][j] = -3;
				else if(str.charAt(j)=='E') map[i][j] = -4;
				else map[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		for(int i=0; i<W; i++) {
			for(int j=0; j<H; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}
