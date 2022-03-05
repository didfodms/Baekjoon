import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q2535 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] sco = new int[N][3];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sco[i][0] = Integer.parseInt(st.nextToken());
			sco[i][1] = Integer.parseInt(st.nextToken());
			sco[i][2] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sco, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int res = o2[2] - o1[2];
				return res;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		int cur = 0;
		for(int i=0; i<3; i++) {
			if(i==2 && sco[0][0]==sco[1][0]) {
				while(sco[0][0] == sco[cur][0]) {
					cur++;
				}
			}
			sb.append(sco[cur][0]+" "+sco[cur][1]+"\n");
			cur++;	//3개만 출력하는거라 상관x, 4개 이상이면 조금 더 복잡할듯?
		}
		
		System.out.println(sb.toString().trim());
	}

}
