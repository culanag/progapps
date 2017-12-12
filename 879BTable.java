import java.util.*;

public class 879BTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		long j = in.nextLong();
		int b = in.nextInt();
		long k = 0;
		
		for(int x = 1; x < a; x++) {
		int c = in.nextInt();
			if(c > b) {
				k = 1;
				b = c;
			} else {
				k++;
			}
			if(k >= j) {
				break;
			}
		}
		System.out.println(b);
	}
}