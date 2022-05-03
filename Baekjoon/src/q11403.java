import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11403 { //�÷��̵� �ͼ� �˰��� 
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] check = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				check[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//���İ��� ��� k
		for(int k = 0; k < n; k++) {
			//��� ��� i
			for(int i = 0; i < n; i++) {
				//���� ��� j
				for(int j = 0; j < n; j++) {
					if(check[i][k] == 1 && check[k][j] == 1) {
						check[i][j] = 1;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d ", check[i][j]);
			}
			System.out.println();
		}

	}

}
