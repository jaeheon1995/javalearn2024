package exam10;

public class Exam10_01 {

	public static void main(String[] args) {
		//5개의 공간을 가지는 배열 선언
		int[] inArrays = new int[5];
		//문자열 5개인 배열선언
		String[] strArrays = new String[5];
		//값과 공간을 가지는 배열 선언
		int[] varArrays = {1,2,3,4,5};
		
		//배열을 출력 배열의 위치를 출력
		System.out.println(inArrays);
	
	//배열의 첫번째 값 출력
		System.out.println(inArrays[0]);
		System.out.println(inArrays[1]);
		
		System.out.println(varArrays[2]);
		
		//배열의 각 자리에 값을 부여 한뒤 출력
		inArrays[0] = 10;
		inArrays[1] = 20;
		
		System.out.println(inArrays[0]);
		System.out.println(inArrays[1]);
		
		
		
				}

}
