package exam23_Car;

public class TyperTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bus b = new Bus("버스");
		taxi t1 = new taxi("개인택시");
		
		//형변환
		Car car = t1;
		
		b.getInfo();
		t1.getInfo();
		
		//부모타입으로 형변환 되면 자식클래스가 가진 기능이나 속성을 사용하지 못한다
		//car.getInfo();
		
		taxi t2 = (taxi)car;
		//강제 형변환
		t2.getInfo();
		
	}

}
