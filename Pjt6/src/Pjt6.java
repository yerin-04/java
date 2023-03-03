import java.util.Arrays;

public class Pjt6 {

	public static void main(String[] args) {
		
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		//배열 길이 
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		//배열 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		//배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		//배열 레퍼런스
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		/*
		 * arrAtt1과 arrAtt2는 주소가 같지만 arrAtt3은 주소가 다름.
		 * arrAtt3은 구성 요소만 같고 주소는 다름
		 */
	}
	
	
	
}
