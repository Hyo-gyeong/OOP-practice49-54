//��ǻ���а� 20190975 ��ȿ��
public class Practice54 {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();
		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.print(b1.toString());
		
		System.out.println("\n\n�� ��° ���� ������ �����Դϴ�.");
		BankAccount b2 = new BankAccount("�赿��", 100);
		System.out.print(b2.toString());
		
		System.out.println("\n\n�� ��° ���� ������ �����Դϴ�.");
		BankAccount b3 = new BankAccount("ȫ�浿", 2000, 2.15);
		System.out.print(b3.toString());
	}

}
