package exam16;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st01 = new Student();
		Student st02 = new Student();
		
		Student.school = "강남 고등학교";
		
		
		st01.myName="홍길동";
		st02.myName="이영희";
		
	
		st01.schoolInfo();
		System.out.println("나의 학교는"+Student.school);
		
		
		
	}

}
