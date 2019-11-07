//컴퓨터학과 20190975 신효경
public class Practice50 {

	public static void main(String[] args) {
		
		Plane def = new Plane();
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println(def.toString());
		
		System.out.println("\n제주행 비행기의 정보입니다.");
		Plane jeju = new Plane();
		jeju.setId(1030615);
		jeju.setModel("보잉 737");
		jeju.setCapacity(75);
		System.out.println(jeju.toString());
		
		System.out.println("\n서울행 비행기의 정보입니다.");
		Plane seoul = new Plane(2464737, "보잉 747", 150);
		System.out.println(seoul.toString());
	}

}
