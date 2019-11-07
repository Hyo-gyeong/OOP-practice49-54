//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Date birth = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birth.setYear(input.nextInt());
		System.out.print("태어난 월을 입력하세요 : ");
		birth.setMonth(input.nextInt());
		System.out.print("태어난 날짜를 입력하세요 : ");
		birth.setDay(input.nextInt());
		
		System.out.print(birth.toString());
		
		input.close();
		
	}

}
