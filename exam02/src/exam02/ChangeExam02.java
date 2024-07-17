package exam02;

public class ChangeExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'E';
		int num = 197;
		
		int chToNum = 0;
		char intToCh = ' ';
		
		//int-->char변환시에는 강제형변환
		chToNum = ch;
		intToCh = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToCh);
		//형변환시 데이터 크기 확인후 자동,강제 형변환 선택
		
		

	}

}
