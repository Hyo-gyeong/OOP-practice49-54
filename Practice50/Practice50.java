//��ǻ���а� 20190975 ��ȿ��
public class Practice50 {

	public static void main(String[] args) {
		
		Plane def = new Plane();
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.println(def.toString());
		
		System.out.println("\n������ ������� �����Դϴ�.");
		Plane jeju = new Plane();
		jeju.setId(1030615);
		jeju.setModel("���� 737");
		jeju.setCapacity(75);
		System.out.println(jeju.toString());
		
		System.out.println("\n������ ������� �����Դϴ�.");
		Plane seoul = new Plane(2464737, "���� 747", 150);
		System.out.println(seoul.toString());
	}

}
