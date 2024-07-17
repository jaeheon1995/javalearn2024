package Exam23_manytype;

public class compmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerRoom room = new ComputerRoom();
		room.setCom1(new LzCom());
		room.setCom2(new Samsongcom());
		
		room.allPowerOn();
		room.allPowerOff();
		
		
		
	}

}
