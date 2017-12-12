import java.util.Scanner;
public class MaximumSplitting {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i<n;i++)
			a[i]=in.nextInt();
		for(int i = 0;i<n;i++){
			int a1,a2,a3 = 0;
			a1 = a[i]/4;
			a2 = a[i]%4;
						if(a2==0)a3=a1;
			else if(a1>=2&&a2==1) a3=a1-1;
			else if(a1>=1&&a2==2) a3=a1;
			else if(a1>=3&&a2==3) a3=a1-1;
			else a3=-1;
			b[i] = a3;
		}
		for(int i =0;i<n;i++)
		System.out.println(b[i]);
	}
}