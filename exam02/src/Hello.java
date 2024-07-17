
public class Hello {

	public static void main(String[] args) {
		int num01 = 15;
		long lyNum01 = 20;
		byte byNum01 = 0;
		
		//자동형변환
		lyNum01 = num01;
		
		//강제형변환
		byNum01 = (byte)num01;
		
		int num02 = 130;
		byte bynum02 = 0;
		
		bynum02 = (byte)num02;
		
		System.out.println("형변환1 int " + num01 +" --->long" + lyNum01);
		System.out.println("형변환1 int " + num01 +" --->byte" + byNum01);
		System.out.println("형변환1 int " + num01 +" --->byte" + bynum02);
		
		System.out.println("===============================");
		
		char ch01 = 'z';
		int intNum01 = 8;
		
		ch01 = (char)intNum01;
		intNum01 = ch01;
		
		System.out.println("자동형변환 int---->문자" +"chartype" + ":" + intNum01);
		System.out.println("강제형변환 int-->문자" +"inttype" + ":" + ch01);
		
		
		
	}

}
