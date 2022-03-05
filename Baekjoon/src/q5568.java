import java.util.HashSet;

public class q5568 {

	public static void main(String[] args) {
		static int[] cards;
		static int N, K;
		static HashSet<String> set;
		
		static void Proc(int[] t) {
			String str = "";
			for (int i=0; i<K; i++)
				str += cards[t[i]];
			set.add(str);
		}
		
		static void Perm(int[] t, int loc) {
			
		}
		
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			
			cards = new int[N];
			int[] map = new int[N];
			
		}
	}

}
