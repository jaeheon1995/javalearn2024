package exam17;

public class person {

	private int age;
	private String myName;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("잘못된 값 입니다");
		return;
		}
		this.age = age;
	}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
	
	
}
