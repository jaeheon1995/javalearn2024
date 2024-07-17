package exam17;

public class Ex08_03 {

	public static void main(String[] args) {
		int money =30000;
		int count = 0;
		while(true) {
			if(money < 1500) {
				System.out.println(count + "만큼 이용");
				System.out.println("충전필요");
				return;
				
			}
			money -= 1500;
			count++;
			
		}
	}
	
	
}
