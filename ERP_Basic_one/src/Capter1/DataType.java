package Capter1;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형 데이터 타입
		
				// 정수형 데이터 타입 : 실수부가 존재하지 않는 정수를 나타냄(부호를 가지고 있음)
				 
				// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입 -128부터+127까지 
				byte byte1 = -128;
				//byte1 = 128; 범위초과
				
				// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
				// -32_768 ~ +32_767까지
				short short1 = 128;
//				short1 = 32_768; 범위초과
				
				// int : 4byte(32bit)의크기를 가지는 정수형 데이터 타입
				//-2_147_483_648부터 2_147_483_647까지
				
				int int1 = 32_768;
				//int1 = 2_147_483_648; 정수형 리터럴 상수는 int 타입이다.
				//int1 = 2_147_483_648L; long타입 리터럴 상수 지정
				
			    //long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
				long long1 = 3_000_000_000L;
				
				// 가장많이 사용되는 정수형 타입은 int
				// 메모리 공간을 절약할때 사용되는 정수형 타입 : byte,short
				// 큰 수를 다룰때 사용되는 정수형 타입 : long
				
				int a = 200000, b = 300000;
				int result = a +b;
				System.out.println(result);
				//정수형 int를 연산결과를 저장하는 데이터 타입으로 사용할경우 
				//연산결과가 범위를 초과할수 있는지 주의할 필요가 있음
				result = a*b;
				System.out.println(result);
				
				//실수형 데이터 타입 : 실수부를 가지는 데이터 타입
				
				//float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
				//소수점 6 ~ 7 자리에 오차가 발생
				//실수형 리터럴 상수는 double 타입
				float float1 = 3.14159265358949323846f; 
				System.out.println(float1);
				
				// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
				//소수점 15-17자리에서 오차 발생
				double double1 = 3.14159265358949323846;
				System.out.println(double1);
				
				//문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
				
				//char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
				//0 - 65,535
				//문자를 리터럴로 표현할 땐 ''로 묶어서 표현
				char char1 = 'a';
				char char2 = 97;
				
				System.out.println(char1);
				System.out.println(char2);
				
				//논리형데이터 타입 : 참,거짓을 가지는 데이터 타입
				
				//boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터타입
				//true,false
				
				boolean boolean1 = true;
				boolean boolean2 = false;
				
				//형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는것
				//자동 형변환 : 작은데이터 타입의 변수를 큰데이터 타입의 변수에 옮겨 담을때 발생
				//강제 형변환 : 큰데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을때 발생
				
				int number = 300;
				long long2 = number;
				number = (int) long2;
				
				char char3 = 100;
				short short2 = (short)char3;
				int int2 = char3;
				
				//배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
				//new연산자를 이용하여 생성을 해야함
				//한번 생성된 배열의 크기는 변경할 수 없다
				
				//배열 변수 선언
				//데이터타입[] 배열변수명;
				//배열 생성
				//new 데이터타입 [배열의 길이];
				int[] numbers;
				//numbers = 3;
				numbers = new int[5];
				
				int[] numbers2 = {1,2,3,4,5};
				int[] numbers3 = new int[]{1,2,3,4,5};
				System.out.println(numbers);
				System.out.println(numbers2);
				System.out.println(numbers3);
				
				//배열의 요소에 접근할 때는 '인덱스'사용
				//인덱스는 0번부터 시작하여 길이의 -1까지
				int item = numbers3[2];
				
				System.out.println(item);
				
				numbers3[0] = 9;
				item = numbers3[0];
				
				System.out.println(item);
				
				//인덱스 범위를 초과하는 인덱스에 접근할 시 예외발생
			    //System.out.println(numbers3[90]);
			    
			    //배열의 길이를 확인하고자 할때는 .length를 사용
			    System.out.println(numbers3.length);
				
			    int[] example1 = new int[] {1,2,3};
			   int[] example2 =example1;
			    example1[1] =99;
			    
			    System.out.println(example1);
			    System.out.println(example2);
			    System.out.println(example1[1]);
			    System.out.println(example2[1]);
			    
			    char[] chars1 = {'a','p','p','l','e'};
			    System.out.println(chars1);
			   
			    //String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
			    //선언
			    //String 변수명;
			    //생성
			    //new String(); 
			    // 초기화
			    //변수명 = "문자열";
			    
			    String string1;
			    new String();
			    string1 = "apple";
			    System.out.println(string1);
			    
			    //문자열(String)의 주요 기능
			    String statement ="  My name is loki  ";
			    
			    //1,문자열 결합
			    //+혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
			    System.out.println(statement + "@@@");
			    System.out.println(statement.concat("!!!"));
			    
			    //2,문자열 비교
			    //equals(문자열): 두 문자열이 동등한지 비교
			    //compareTo(문자열): 두 문자열을 사전순으로 비교(대소문자 구분)
			    //compareToIgnoreCase(문자열): 두 문자열을 사전순으로 비교(대소문자 미구분)
			    System.out.println(statement.equals("  My name is loki  "));
			    System.out.println(statement.compareTo("  My name is loki  "));
			    
			    //3,문자열길이
			    //length():문자열의 길이를 반환
			    System.out.println(statement.length());
			    
			    //4,문자열 변환
			    //toUpperCase() : 모든 문자를 대문자로 변경
			    //toLowerCase() : 모든 문자를 소문자로 변경
			    //trim() : 문자열의 앞 뒤 공백을 제거
			    System.out.println(statement.toUpperCase());
			    System.out.println(statement.toLowerCase());
			    System.out.println(statement.trim());
			    
			 // 5. 문자열 찾기
			 		// indexOf(문자열): 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
			 		// lastIndexOf(문자열): 찾고자하는 문자열의 마지막 찾은 위치의 인덱스 번호를 반환
			 		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
			 		System.out.println(statement.indexOf("기린"));
			 		System.out.println(statement.indexOf("사자"));
			 		System.out.println(statement.lastIndexOf("기린"));
			 		System.out.println(statement.lastIndexOf("사자"));
			 		
			 		// 6. 부분 문자열
			 		// substring(시작인덱스), substring(시작인덱스, 종료인덱스): 문자열을 원하는 크기만큼 추출
			 		System.out.println(statement.substring(26));
			 		System.out.println(statement.substring(26, 31));
			 		
			 		//참조형 데이터 타입
			 		//주소를 가지고있는 변수의 데이터 타입
			 		//null을 가질 수 있다.(null: 아무것도 지정되지 않은 상태)
			 		//배열,클래스,인터페이스,열거형이 참조형 데이터 타입에 속함
			 		String string2 = null;
			 		//System.out.println(string2.trim());
			 		

	}

}
