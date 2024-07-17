package exam23_instanceof;

import Exam23_manytype.Computer;
import Exam23_manytype.LzCom;
import Exam23_manytype.Samsongcom;

public class CompareIncetance {

	public static void getMyType(Computer com) {
		if(com instanceof Samsongcom) {
			System.out.println("삼성컴퓨터");
		}else if(com instanceof LzCom){
			
				System.out.println("LzCom");
			
		}else {
			System.out.println("unknown");
		}
	}
	public static void main(String[] args) {
		Samsongcom com1 = new Samsongcom();
		LzCom lz = new LzCom();
		CompareIncetance.getMyType(com1);
		CompareIncetance.getMyType(lz);

	}
}
