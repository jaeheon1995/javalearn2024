package Capter1;

public class Controletc {

	public static void main(String[] args) {
		
		//continue : 반복문에서 continue 를 만나면 조건 검사로 넘어감
		//break : 반복문에서 break 문을 만나면 반복문을 종료
		//continue,break 문은 조건문과 함께 사용
		
		//count 가 3의 배수가 아니면 count 를 출력
		//count 가 4의 배수이면서 11의 배수이면 반복을 종료
		for(int count = 1; count <= 100; count++) {
			if(count % 3 == 0) continue;
			if (count % 4 == 0 && count % 11 == 0) break;
			System.out.println(count);
		}

	}

}
