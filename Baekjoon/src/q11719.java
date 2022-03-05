/*
 * import java.util.Scanner;
 * 
 * public class q11719 {
 * 
 * public static void main(String[] args) throws Exception { Scanner sc = new
 * Scanner(System.in); String input = ""; while( sc.hasNextLine() ) { input =
 * sc.nextLine(); System.out.println(input); } } }
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q11719 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while( (input = br.readLine()) != null ) {
			System.out.println(input);
		}
	}
}