package exam11;

public class DeepOpyOfExam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = {1,6,9,8,2,7};
		int[] newcards = new int[5];
		
		//복사 메서드 이용하여깊은복사
		
		System.arraycopy(cards, 1, newcards,0, newcards.length);
		
		System.out.println("card : ");
		for(int i = 0; i<cards.length; i++) {
			System.out.print(cards[i] + "\t");
		}
		    System.out.println();
			System.out.println("newcard : ");
			for(int i = 0; i<newcards.length; i++) {
				System.out.print(newcards[i] + "\t");
			
			
		}
		}

	}

