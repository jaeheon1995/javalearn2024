package exam17;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person p01 = new person();
		
		p01.setMyName("홍길동");
		p01.setAge(300);
		
		System.out.println("나는"+p01.getMyName()+"이고 나이가"+p01.getAge()+"살이다");
	}

}
