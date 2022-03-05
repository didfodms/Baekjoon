import java.util.Scanner;

public class q2884{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt(); int mm = sc.nextInt();
        sc.close();
        mm += hh*60 + 24*60; mm -= 45;
        System.out.println(mm/60%24 + " " + mm%60);
    }
}
