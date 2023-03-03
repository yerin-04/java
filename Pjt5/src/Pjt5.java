
public class Pjt5 {

	public static void main(String[] args) {
		
		//배열 선언 후 초기화
		int[] arr1 = new int[5]; //배열 선언 단계
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr[0] : " + arr1[0]);
		System.out.println("arr[1] : " + arr1[1]);
		System.out.println("arr[2] : " + arr1[2]);
		
		//배열 선언과 초기화를 동시에
		int[] arr2 = {10, 20, 30};
		System.out.println("arr[0] : " + arr2[0]);
		System.out.println("arr[1] : " + arr2[1]);
		System.out.println("arr[2] : " + arr2[2]);
		
		/*int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30; 와 같음
		*/
	}
	
	
	
	
	
}
