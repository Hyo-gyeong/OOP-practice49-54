//��ǻ���а� 20190975 ��ȿ��
public class Practice51 {

	public static void main(String[] args) {

		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		System.out.println("����Ʈ ������ �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println("ù ��° ������ �����Դϴ�.");
		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		System.out.println(b1.toString());
		System.out.println("�� ��° ������ �����Դϴ�.");
		System.out.println(b2.toString());
		
	}

}
