import java.util.Scanner;
import java.util.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class q11066 {
	static int S, nC;
	static int[] chap;
	static int[][] Dcost, Dsize;
	
	static void ChapCost(int fr, int to, int[] sz, int[] cost) {
		int[] psz1 = new int[1];
		int[] psz2 = new int[1];
		int[] pcost1 = new int[1];
		int[] pcost2 = new int[1];
		
		if(Dcost[fr][to] != -1) {
			sz[0] = Dsize[fr][to];
			cost[0] = Dcost[fr][to];
			return;
		}
		if (fr == to) {
			sz[0] = chap[fr];
			cost[0] = 0;
			Dsize[fr][to] = sz[0];
			Dcost[fr][to] = cost[0];
			return;
		}
		
		cost[0] = 1000000000;
		for(int i=fr; i<to; i++) {
			ChapCost(fr, i, psz1, pcost1);
			ChapCost(i+1, to, psz2, pcost2);
			int tmp = pcost1[0] + pcost2[0] + psz1[0] + psz2[0];
		
			if(tmp < cost[0]) {
				cost[0] = tmp;
				sz[0] = psz1[0] + psz2[0];
			}
		}
		Dcost[fr][to] = cost[0];
		Dsize[fr][to] = sz[0];
	}
	
	public static void main(String[] args) {
		int[] sz = new int[1]; int[] cost = new int[1];
		
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		for(int k=0; k<S; k++) {
			nC = sc.nextInt();
			chap = new int[nC];
			Dcost = new int[nC][nC];
			Dsize = new int[nC][nC];
			for(int i=0; i<nC; i++) {
				chap[i] = sc.nextInt();
				Arrays.fill(Dcost[i], -1);
				Arrays.fill(Dsize[i], -1);
			}
			ChapCost(0, nC-1, sz, cost);
			System.out.println(cost[0]);
		}
		sc.close();
	}
	
	/*
	public static void main(String[] args) throws Exception {
		int T, N;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			N = Integer.parseInt(br.readLine());
			
		}
	}
	*/
}
