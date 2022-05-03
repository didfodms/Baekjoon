import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class q2644 {

	static int n, a, b, m;
	static ArrayList<Integer>[] matrix;
	static boolean[] visited;
	static int result = -1;
	
	static void dfs(int node, int cnt) {
		
		visited[node] = true;
		for(int i = 0; i < matrix[node].size(); i++) {
			int next = matrix[node].get(i);
			
			if(next == b) {
				result = cnt;
				return;
			}
			if(!visited[next]) {
				dfs(next, cnt+1);
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n+1];
		matrix = new ArrayList[n+1];
		for(int i = 0; i <= n; i++) {
			matrix[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			matrix[x].add(y);
			matrix[y].add(x);
		}
		
		dfs(a, 0);
		
		System.out.println(result==-1?-1:result+1);
		
	}

}
