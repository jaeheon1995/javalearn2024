package test2;


public class AutomaticCar extends Car {
	//차량번호, 색상, 시동 상태 ,가속, 정차, 시동

	//가속
	public void accelerate() {
		super.accelerate();
		System.out.println("자동 변속기 차량이 가속합니다");}
	//정차
	public void stop(){
		super.stop();
		System.out.println("자동 변속기 차량이 정차합니다");
	}
	//시동
	public void setStart() {
		super.setStart();
		
	}
	
}
