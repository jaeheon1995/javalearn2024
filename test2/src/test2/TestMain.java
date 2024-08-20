package test2;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManualCar car1 = new ManualCar();
		car1.vin("10가 1234");
		car1.color("blue");
		car1.setStart();
		car1.gear();//입력
		
		AutomaticCar car2 = new AutomaticCar();
		car1.vin("10가1234");
		car1.color("blue");
		car1.setStart();
		
		PassengerTrain train1 = new PassengerTrain();
		train1.trainNumber("KTX001");
		train1.departureStation("서울");
		train1.arrivalStation("부산");
		train1.setStart();
		train1.passengerCount(200);
		
		// 화물 열차 { 열차번호 = “Cargo001”, 출발역 = “부산”, 도착역 = “구미” 시동 상태 = true, 화물 무게 = 100.0 }
		FreightTrain train2 = new FreightTrain();
		train2.trainNumber("Cargo001");
		train2.departureStation("부산");
		train2.arrivalStation("구미");
		train2.setStart();
		train2.cargoWeight(100.0);
	}

}
