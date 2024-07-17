package exam09;

public class BreakTestExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(true) {
			int val = (int)(Math.random() * 50)+ 1;
			
			if(val ==30) {
				System.out.println("30!종료");
				break;
			}
			sum += val;
			System.out.println(val+",");
		}
		System.out.println();
		System.out.println(sum);

	}

}
