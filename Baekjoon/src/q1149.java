import java.util.Scanner;

public class q1149{
    static int N;
    static int[][] cost, dyn;
    
    static int rgb(int house, int col){
        int i, min=1000000000;
        if(house == N-1) return cost[house][col];
        if(dyn[house][col] != -1) return dyn[house][col];
        for(i=0; i<3; i++) {
        	if(i==col) continue;
        	min = Math.min(min, rgb(house+1, i));
        }
        dyn[house][col] = min+cost[house][col];
        return dyn[house][col];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cost = new int[N][3];
        dyn = new int[N][3];
        for(int i=0; i<N; i++)
        	for(int j=0; j<3; j++) {
        		cost[i][j] = sc.nextInt();
        		dyn[i][j] = -1;
        	}
        sc.close();
        
        int min=1000000000;
        for(int i=0; i<3; i++) min = Math.min(min,  rgb(0, i));
        System.out.println(min);
    }
}