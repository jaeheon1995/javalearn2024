package exam17;

public class Calc {
	
	public static int sumArrays(int[] nums) {
		int sum = 0;
		for(int i =0; i<nums.length; i++) {
			sum += nums[i];
			
		}
		
		return sum;
	}
			
	
	public static void ptrintResult(int result) {
		System.out.println("결과"+ result);
	}
	

	

}
