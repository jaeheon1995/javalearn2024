package exam05;

public class SwithExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		score = (int)(Math.random() * 100 ) + 1;
		switch(score / 10) {
		
		//100점은 case9와 같은 A학점 이기때문에 break 문을 이용하지 않고 하나로 묶는다
		//""안에 ,를 넣어야 출력이 된다
		case 10 :
		case 9 :
			System.out.println("점수 :" + score +",학점 : A학점입니다");
			break;
		case 8 :
			System.out.println("점수 :" + score +",학점 : B학점입니다");
			break;
		case 7 :
			System.out.println("점수 :" + score +",학점 : C학점입니다");
			break;
			default :
				System.out.println("점수 :" + score +",학점 : F학점입니다");
				
		}

	}

}
