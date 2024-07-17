package exam20_override;

public class samsong extends computer {

	public void powerOn() {
		super.powerOn();
		System.out.println("헬로우.삼성");
	}
	
	public void powerOff() {
		super.powerOff();
		System.out.println("굿바이.삼성");
	}
	
}
