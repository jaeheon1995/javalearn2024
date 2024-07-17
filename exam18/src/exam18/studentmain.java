package exam18;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student st1 = new student();
		student st2 = new student(17,"이태양","송도고등학교");
		
		
	st1.setAge(18);
	st1.setMyName("이영해");
	st1.setSchool("마산고등학교");
	
	System.out.println(st1.getAge()+st1.getMyName()+st1.getSchool());
	System.out.println(st2.getAge()+st2.getMyName()+st2.getSchool());
	
	}

}
