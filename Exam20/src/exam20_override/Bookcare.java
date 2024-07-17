package exam20_override;

import upper.Book;

public class Bookcare extends Book {
public static void main(String[] args) {
	
	Book b = new Book();
	//디폴트 제한자인 경우 같은 패키지 끼리만 접근가능
	//Bookcare는 다른 패키지라 접근이 안됨
	
}
}
