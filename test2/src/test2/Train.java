package test2;

public class Train extends Vehicle {
//열차번호, 출발역, 도착역, 시동 상태
	
	//열차번호
	public void trainNumber(String trainNumber) {
		System.out.println(trainNumber);
	}
	
	//출발역
	public void departureStation(String departureStation) {
		System.out.println("출발역은 " + departureStation+" 입니다");
	}
	
	//도착역
	public void arrivalStation(String arrivalStation) {
		System.out.println("도착역은 "+arrivalStation+" 입니다");
	}
	
	//시동상태
	public void setStart() {
		super.setStart();
	}
}
