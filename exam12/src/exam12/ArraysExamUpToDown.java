package exam12;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExamUpToDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5,7,1,4,11,9,10,2,4,3};
		System.out.println("정렬정 : " + Arrays.toString(arr));
		
		//내림차순 정렬하기
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println("정렬후 : " + Arrays.toString(arr));
	}

}
