package test2;

public class FreightTrain extends Train {
// 화물 무게
	
	//가속
			public void accelerate() {
				super.accelerate();
				System.out.println("화물 열차가 느리게 가속합니다!");
				}
			//정차
			public void stop(){
				super.stop();
				System.out.println("화물 열차가 느리게 정차합니다!");
			}
			//시동
			public void setStart() {
				super.setStart();
				
			}
			
			//화물무게
			public void cargoWeight(double cargoWeight) {
				System.out.println("화물무게는 "+cargoWeight+" kg입니다");
			}
			
}
