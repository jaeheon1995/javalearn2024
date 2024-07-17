package exam07;

public class Ex05_8 {

	public static void main(String[] args) {
		for(int i = 0; i<7; i++) {
			
			//공백은 감소
			for(int j =0; j<7-1; j++) {
				System.out.print(" ");
			}
			//별은 증가해야 하므로 i값을 이용해줌
			for (int star = 1; star< (i+1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
