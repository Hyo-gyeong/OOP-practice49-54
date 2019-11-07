//컴퓨터학과 20190975 신효경
public class Practice54 {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.print(b1.toString());
		
		System.out.println("\n\n두 번째 은행 계좌의 정보입니다.");
		BankAccount b2 = new BankAccount("김동덕", 100);
		System.out.print(b2.toString());
		
		System.out.println("\n\n세 번째 은행 계좌의 정보입니다.");
		BankAccount b3 = new BankAccount("홍길동", 2000, 2.15);
		System.out.print(b3.toString());
	}

}
