package exam07;

public class Ex05_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<=9; i++){
			for(int j = 1; j<=9; j++) {
				System.out.print(i +"X" + j+ "=" + (i*j) + "\t");
				//"\t"탭크기 만큼 띄우기
			}
			System.out.println();
			//내용이 없는 메서드를 사용해 줄바꿈
		}
		

	}

}
