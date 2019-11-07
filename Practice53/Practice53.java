//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice53 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Movie m0 = new Movie();
		System.out.println("디폴트 영화의 정보입니다.");
		System.out.println(m0.toString());
		
		Movie m1 = new Movie();
		System.out.println("\n영화정보를 입력하세요. ");
		m1.setMid(m1.makeID());
		System.out.print("영화제목은? ");
		m1.setTitle(input.next());
		System.out.print("감독은? ");
		m1.setDirector(input.next());
		System.out.print("제작년도는? ");
		m1.setYear(input.nextInt());
		System.out.print("평점은? ");
		m1.setScore(input.nextInt());
		
		System.out.println("\n입력한 영화의 정보입니다.");
		System.out.println(m1.toString());
		
		input.close();
	}

}
