package exam09;

public class ContinueExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 1; i<=100; i++ ) {
			
			//짝수만 더하기
			if(i % 2!= 0) {
				
				continue;//여기서 실행문 종료
				
			}
		 sum += i;
		 
		}
System.out.println(sum);
	}

}
