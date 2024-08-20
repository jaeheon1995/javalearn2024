package test2;

public class Car extends Vehicle {
//차량번호, 색상, 시동 상태
	public void accelerate() {
		super.accelerate();
		System.out.println("차량이 가속합니다");
	}
	public void stop() {
		super.stop();
		System.out.println("차량이 정지합니다");
	}
	
	public void vin(String Vin) {
		System.out.println(Vin);
	}
	public void color(String Color) {
		System.out.println(Color);
	   
	}
	public void setStart() {
		super.setStart();
	}
}
