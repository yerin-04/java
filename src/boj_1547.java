import java.util.Scanner;

public class boj_1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 0;
		arr[2] = 0;
		
		int num = sc.nextInt();
		
		for( int i = 0; i < num; i ++ ) {
			int move1 = Integer.parseInt(sc.next()) - 1;
			int move2 = Integer.parseInt(sc.next()) - 1;
			int tmp = 0;
			
			tmp = arr[move1];
			arr[move1] = arr[move2];
			arr[move2] = tmp;
		}
		
		for (int i = 0; i<3; i ++) {
			if( arr[i] == 1 ) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
}
