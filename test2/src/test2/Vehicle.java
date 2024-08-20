package test2;

public class Vehicle {
//가속, 정차, 시동 
	boolean isStart= false; 
	
	public void accelerate() {
	
	}
	public void stop() {
		
	}
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public void setStart() {
		if (isStart == false) {
			System.out.println("시동이 꺼져있습니다");}
			else {System.out.println("시동이 켜져있습니다");}
						
	}
	
}
