import java.util.Scanner;
import java.util.ArrayList;

public class q17626{
		static int N;
		static ArrayList<Integer> P; //어레이리스트 P선언
		
		public static int Proc() {
			if(P.contains((Integer)N)==true) return 1;
			for(int t1 : P)
				for(int t2 : P)
					if(t1+t2 == N) return 2;
			for(int t1 : P)
				for(int t2 : P)
					for(int t3 : P)
						if(t1+t2+t3 == N)
							return 3;
			return 4;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			P = new ArrayList<Integer>();
			N = sc.nextInt(); sc.close();
			
			for(int i=1; i*i<=N; i++) P.add(i*i);
			
			System.out.println(Proc());
	}
}
