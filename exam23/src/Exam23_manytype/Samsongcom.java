package Exam23_manytype;

public class Samsongcom implements Computer {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("사랑해요 삼성");
		System.out.println("전원이 켜집니다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전원이 꺼집니다");
		System.out.println("사랑해요 삼성");
	}

}
