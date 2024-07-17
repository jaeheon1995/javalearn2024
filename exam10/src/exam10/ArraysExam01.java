package exam10;

public class ArraysExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		//배열의 값에 규칙성이 있을땐 for문을 활용하면 좋다
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) +1;
			
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
			sum += arr[i];
			
		}
		System.out.println("\n합 :" + sum);

	}

}
