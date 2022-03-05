import java.util.Scanner;

public class q10039{
    static int[] student = new int[5];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        for(int i=0; i<5; i++){
            student[i] = sc.nextInt();
            if(student[i]<40) sum += 40;
            else sum += student[i];
        }
        sc.close();
        
        System.out.println(sum/5);
    }
}