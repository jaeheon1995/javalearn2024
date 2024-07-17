package exam18;

public class student {

	private int age;
	private String myName;
	private String school;
	
	public student() {
		
	}
	
	public student(int age,String myName) {
		this.myName = myName;
		this.age = age;
	}
	//오버로딩
	
	public student(int age,String myName,String school) {
		this(age,myName);
		this.school=school;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
