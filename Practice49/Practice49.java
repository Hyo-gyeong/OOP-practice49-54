//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Date birth = new Date();
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		birth.setYear(input.nextInt());
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		birth.setMonth(input.nextInt());
		System.out.print("�¾ ��¥�� �Է��ϼ��� : ");
		birth.setDay(input.nextInt());
		
		System.out.print(birth.toString());
		
		input.close();
		
	}

}
