package Capter1;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//코드블럭 
				//코드들의 묶음(하나의 기능으로 취급)
				//{}로 표시
				
				//지역변수내에서 선언한 변수는 코드블럭 안에서 작동
				{
					//더하기 연산
					int a = 10;
					int b = 20;
					int result = a + b;
//					System.out.println(result);
				}
				
				
				{
					//빼기 연산
					int a = 10;
					int b = 5;
					int result = a - b;
//					System.out.println(result);
				}
				
				//제어문 : 조건에 따라서 코드의 흐름을 결정하는 것 
				
				//조건문 : 특정 조건이 만족하면 해당 코드 블럭을 실행하도록 하는것
				
				//if문 : 주어진 조건이 true 이면 코드를 실행하게 하는 것
				//if(조건-논리표현식){true 이면 실행할 코드}
				
				System.out.println("if문 코드 실행");
				
				// 점수가 60점 이상이면"통과"라는 문자를 출력
				// 그렇지 않으면 아무것도 출력하지 않음
				int score = 50;
				
				if (score >= 60) {
					System.out.println("통과");
				}

				System.out.println("if문 코드 종료");
				
				// else문 : if문의 조건-논리표현식이 false이면 코드를 실행하게 하는것
				//if (조건-논리표현식) {true이면 실행할 코드블럭}else{조건-논리표현식이 false이면 실행할 코드 블럭}
				
				//주의!
				//1. else문은 반드시 if문 이후에 와야함(else문 단독사용이 불가능)
				//2. else문에는 조건을 작성하지 않는다.
				
				//점수가 60점 이상이면 "통과"라는 문자열을 출력하고
				//그렇지 않으면 "과락"이라는 문자열을 출력
				
				System.out.println("else문 코드 실행");
				
				score = 50;
				if(score >= 60) {
					System.out.println("통과");
				}else {
					System.out.println("과락");
				}
				
				System.out.println("else문 코드 종료");
				
				//나이가 30살 이상 이면서 성별이 남자이면 "30대 중년 남성 입니다"를 출력
				//그렇지 않으면"일반인 입니다"출력
				
				int age = 20;
				String gender = "여자";
				
				if(age >= 30) {
					if(gender.equals("남자")){
						System.out.println("30대 중년 남성 입니다");
					}else {
						System.out.println("일반인입니다.");
					}
				}else {
					System.out.println("일반인입니다.");
				}
				
				
				//나이가 30살 이상 이면서 성별이 남자라는 조건을 논리연산자를 이용하여 표현
				if(age >= 30 && gender.equals("남자")) {
					System.out.println("30대 중년 남성 입니다");
				}else {
					System.out.println("일반인입니다.");
				}
				
				//논리식에 이름을 부여
				boolean isMiddleMan = age >= 30 && gender.equals("남자");
				
				if(isMiddleMan) {
					System.out.println("30대 중년 남성 입니다");
				}else {
					System.out.println("일반인입니다.");
				}
				
				// 점수가 90점 이상이면 "A" 출력
				// 점수가 80점 이상이면 "B" 출력
				// 점수가 70점 이상이면 "C" 출력
				// 점수가 60점 이상이면 "D" 출력
				// 점수가 60점 미만이면 "F" 출력
				
				score = 90;
				
				if(score >=90) System.out.println("A"); 
				else if(score >= 80) System.out.println("B");
				else if(score >= 70) System.out.println("C");
				else if(score >= 60) System.out.println("D");
				else System.out.println("F");
				
				//지역변수 안에 명령어가 하나일경우 괄호생략가능
				
				
				
				
	}

}
