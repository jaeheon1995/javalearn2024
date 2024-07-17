import java.util.Scanner;

public class LottoSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1~45까지의 숫자를 담을 배열
		int[]lottoMachine = new int[45];
		//선택된 번호를 저장할 배열
		int[]lottoBalls = new int[6];
		//보너스 번호
		int bonusenumber = 0;
		
		for(int i = 0; i < lottoMachine.length; i++) {
			lottoMachine[i] = i+1;
		}
		int count = 0;
		while(count < 7) {
			//공의 선택위치를 랜덤함수로
			int index = (int)(Math.random()*45);
			//index의 주소가 0부터 시작하기 때문에 +1을 하지않는다
			//선택된 인덱스의 값이 0이아니면 미사용 0이면 사용된위치
			if(lottoMachine[index] !=0) {
				
				if(count < 6) {
					lottoBalls[count++] = lottoMachine[index] ;
				}else {
					bonusenumber = lottoMachine[index];
					count++;
				}
				
				lottoMachine[index] = 0;//사용했다는 증명
			}		
		}
		for(int i = 0; i<lottoBalls.length; i++) {
			System.out.print(lottoBalls[i] + " ");
		}
		System.out.println("보너스번호" + bonusenumber);
		
		
		count = 0;
		Scanner scan = new Scanner(System.in);
		int[] userlotto = new int[6];
		
		while(count < 6) {
			
			System.out.println((count+1) +"번째로또번호입니다");
			int balls = scan.nextInt();
		
			//중복체크
			for(int i =  0; i<count; i++) {
				if(userlotto[i]==balls) {
					System.out.println(balls + "는 이미 존재하는 번호입니다");
					balls = 0;//중복됬다는 의미
					break;
				}
			}
			if(balls != 0) {
				userlotto[count++] = balls;
				
			}
			
		}
		
		scan.close();
		System.out.println("사용자로또");
		for(int i = 0; i<lottoBalls.length; i++) {
			System.out.print(userlotto[i] + " ");
	}
	int matchcount = 0;
	boolean isbonuse = false;
		for(int i = 0; i < userlotto.length; i++) {
			for(int j=0;j<lottoBalls.length; j++) {
				if(lottoBalls[j]==userlotto[i]) {
					matchcount++;
					break;
					
				}
			}
			if(!isbonuse) {
				if (userlotto[i] == bonusenumber) {
					isbonuse = true;
				}
			}
		}
	//등수출력
		if(matchcount == 6) {
			System.out.println("1등입니다");
		}else if(matchcount ==5) {
			System.out.println("2등입니다");
		}else if(matchcount ==4) {
			System.out.println("3등입니다");
	}else if(matchcount ==3) {
		System.out.println("4등입니다");}
	else {
		System.out.println("낙첨입니다.");
	}
	}
	
	
	
	
	
	
	
	
	
}
	
