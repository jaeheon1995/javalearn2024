package exam04;

import java.util.Scanner;

public class IFTest02 {

	public static void main(String[] args) {
            
     Scanner scan = new Scanner (System.in);
     
     System.out.println("나이를 입력 :");
     int age = scan.nextInt();
     
     if (age > 19) {
    	 System.out.println("성인입니다.");
     }else {
    	 System.out.println("미성년자입니다");
     }
     
     scan.close();
     
    	 
     
     

	
	}
}
