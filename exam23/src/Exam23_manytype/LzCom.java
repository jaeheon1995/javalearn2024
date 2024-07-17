package Exam23_manytype;

public class LzCom implements Computer {

	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("환영합니다 엘지");
		System.out.println("전원이 켜집니다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("고맙습니다");
		System.out.println("전원이 꺼집니다");
		
	}

	
	
	
}
