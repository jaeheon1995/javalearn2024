package exam17;

public class bank {

	private int money;
	
	//입금
	public void setMoney(int money) {
		if (money<0) {
			System.out.println("잘못된 값입니다");
			return;//일찍 종료
		}
		this.money = money;
		
	}
	
	//잔액
	public int getMoney(){
			return money;
	}
	
}
