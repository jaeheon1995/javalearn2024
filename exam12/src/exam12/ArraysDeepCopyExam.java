package exam12;

import java.util.Arrays;

public class ArraysDeepCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = {1,3,5,7,9};
		
		
		//깊은복사
		int[] newcards = Arrays.copyOf(cards, cards.length);
		
		System.out.println("복사후 : " + Arrays.toString(newcards));
	
	cards[1] = 10;
	newcards[3] = 22;
	System.out.println("변경후 : " + Arrays.toString(cards));
	System.out.println("변경후 : " + Arrays.toString(newcards));
}

}
