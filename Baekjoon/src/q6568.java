import java.util.Scanner;

public class q6568 {
	static int[] mem;
	
	static int Bin2Dec(String tt) {
		int ss = 0;
		for(int i=0; i<tt.length(); i++) {
			ss = ss*2 + (tt.charAt(i)-'0');
		}
		return ss;
	}
	
	static String Dec2Bin(int n) {
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		while(n > 0) {
			sb.append(n%2);
			n /= 2;
		}
		for (int i=idx; i<8; i++) sb.append(0);
		sb.reverse();
		return sb.toString();
	}
	
	static int Proc() {
		int pc = 0, ac = 0;
		while(true) {
			int opcode = mem[pc]/32, orand = mem[pc]%32;
			switch(opcode) {
				case 0 : {
					mem[orand] = ac;
					pc = (pc+1)%32;
					break;
				}
				case 1 : {
					ac = mem[orand];
					pc = (pc+1)%32;
					break;
				}
				case 2 : {
					if(ac==0) pc = orand;
					else pc = (pc+1)%32;
					break;
				}
				case 3 : {
					pc = (pc+1)%32;
					break;
				}
				case 4 : {
					ac = (ac+255)%256;
					pc = (pc+1)%32
					break;
				}
				case 0 : {
					mem[orand] = ac;
					pc = (pc+1)%32;
					break;
				}
				case 0 : {
				mem[orand] = ac;
					pc = (pc+1)%32;
					break;
				}
				case 0 : {
					mem[orand] = ac;
					pc = (pc+1)%32;
					break;
				}
			
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
