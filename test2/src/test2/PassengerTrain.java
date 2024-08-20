package test2;

public class PassengerTrain extends Train {
// 탑승객 수
	//가속
		public void accelerate() {
			super.accelerate();
			System.out.println("여객 열차가 천천히 가속합니다!");
			}
		//정차
		public void stop(){
			super.stop();
			System.out.println("여객 열차가 천천히 정차합니다!");
		}
		//시동
		public void setStart() {
			super.setStart();
			
		}
		
		public void passengerCount(int count) {
			System.out.println("탑승객은"+count+"명입니다");
		}
		
}
