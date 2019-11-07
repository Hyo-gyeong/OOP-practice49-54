//컴퓨터학과 20190975 신효경
import java.util.Random;
public class Practice52 {

	public static void main(String[] args) {

		Random rg = new Random();
		
		int c1 = 0;
		int c2 = 0;
		
		for (int i = 0; i < 10000; i++) {
			
			int x = rg.nextInt(9000)+1000;
			
			if(x == 1000) {
				System.out.print(x + "*\t");
				c1++;
			}
			else if (x == 9999) {
				System.out.print(x + "+\t");
				c2++;
			}
			else {
				System.out.print(x + "\t");
			}
			
			if ((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("# of 1000: "+c1);
		System.out.println("# of 9999: "+c2);
			
	}

}
