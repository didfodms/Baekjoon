import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1463_2 {				//top-down

	static int N;
	static int[] d;
	
	static int Re(int n) {
		if(n==1) return 0;
		if(d[n] > 0) return d[n];	//메모리제이션
		
		d[n] = Re(n-1)+1;
		if (n%2 == 0) {
            int temp = Re(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n%3 == 0) {
            int temp = Re(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
		return d[n];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		d = new int[N+1];			//index를 N까지 써야하므로 +1
		
		System.out.println(Re(N));
	}

}
