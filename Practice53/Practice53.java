//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice53 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Movie m0 = new Movie();
		System.out.println("����Ʈ ��ȭ�� �����Դϴ�.");
		System.out.println(m0.toString());
		
		Movie m1 = new Movie();
		System.out.println("\n��ȭ������ �Է��ϼ���. ");
		m1.setMid(m1.makeID());
		System.out.print("��ȭ������? ");
		m1.setTitle(input.next());
		System.out.print("������? ");
		m1.setDirector(input.next());
		System.out.print("���۳⵵��? ");
		m1.setYear(input.nextInt());
		System.out.print("������? ");
		m1.setScore(input.nextInt());
		
		System.out.println("\n�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println(m1.toString());
		
		input.close();
	}

}
