import java.util.Scanner;

public class q17521 {

	public static void main(String[] args) {
		int n;
		long w; //n은 일수, w는 초기현금.
		int price[] = new int[20];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();  w = sc.nextLong();
		for(int i=1; i<=n; i++) {
			price[i] = sc.nextInt();
		}
		sc.close();
		
		int inc[] = new int[20]; //기울기 상태 0그대로, 1감소->증가, -1증가->감소
		inc[1] = -1;
		for(int i=1; i<=n-1; i++) {
			if((price[i]-price[i+1])>0) inc[i+1] = -1;
			else if((price[i]-price[i+1])<0) inc[i+1] = 1;
			else inc[i+1] = 0;
		}
		
		long c = w/price[1]; //현재 보유 코인의 수
		w -= c*price[1];
		for(int i=2; i<=n-1; i++) {
			if(inc[i]==1 && inc[i+1]==-1) { //price[i]가 최댓값이면 판다.
				w += c*price[i]; c = 0;
			}
			else if(inc[i]==-1 && inc[i+1]==1) { //price[i]가 최솟값이면 산다.
				c += w/price[i]; w -= c*price[i]; 
			}
		}
		w += c*price[n];
		System.out.println(w);
	}
}
