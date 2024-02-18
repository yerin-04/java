import java.util.Scanner;

public class boj_19698 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int l = sc.nextInt();
		
		int result = (w/l) * (h/l);
		if( result >= n ) {
			System.out.println(n);
		}
		else {
			System.out.println(result);
		}
	}
}
