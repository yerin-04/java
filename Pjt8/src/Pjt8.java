import java.util.Scanner;

public class Pjt8 {
	
	public static void main(String[] args) {
		
		System.out.println("Input Number : ");
		
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		//for문
		for(int i = 0; i<10; i++) {
			System.out.println(inputNum*i);
			
		/*
		 * while문
		 * System.out.print("INPUT NUMBER : ");
		 * int num = scanner.nextInt();
		 * int i = 1;
		 * while (i<10) {
		 *  System.out.printf(%d * %d = %d\n", num, i, (num * i));
		 *  i++;
		 *  }
		 *  while문은 조건식만 갖고 있음. 나머지는 외부에 존재 (int i = 1;)
		 */
		}
		
		scanner.close();
	}

}
