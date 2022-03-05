import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q10814 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] data = new String[N][3];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = st.nextToken();
			data[i][1] = st.nextToken();
			data[i][2] = Integer.toString(i);
		}
		
		Arrays.sort(data, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int res = Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				if(res == 0) return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				return res;
			}	
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(data[i][0]+" "+data[i][1]+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
