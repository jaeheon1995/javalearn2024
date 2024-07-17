package exam12;

import java.util.Arrays;

public class ArraysExamToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,1,4,11,9,10,2,4,3};
		// 자동으로 오름차순 정렬 하기
		System.out.println("정렬정 : " + Arrays.toString(arr));
		Arrays.sort(arr);

		System.out.println("정렬후 : " + Arrays.toString(arr));

	}

}
