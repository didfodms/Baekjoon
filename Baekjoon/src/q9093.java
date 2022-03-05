import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class q9093 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str = br.readLine() + "\n";
            Stack<Character> stack = new Stack<>();
            for(char ch : str.toCharArray()) {
                if(ch==' ' || ch=='\n'){
                    while(!stack.isEmpty()) bw.write(stack.pop());
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}
