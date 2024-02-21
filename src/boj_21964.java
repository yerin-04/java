import java.util.Scanner;

public class boj_21964 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();//nextLine()이 아닌 next() 사용하기
		
		for(int i = 0; i<5; i++) {
			System.out.print(str.charAt(num-5+i));
		}
	}
}
