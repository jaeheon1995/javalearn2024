package exam08;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건에 관계없에 1회는 반복할땐 dowhile
		int count = 1;
		
		while(count < 1) {
			System.out.println("실행");
		}
		do {
			System.out.println("do-while실행");
		}while(count < 1);
		

	}

}
