//��ǻ���а� 20190975 ��ȿ��
import java.util.Random;
public class Movie {

	Random rn = new Random();
	private String mid;
	private String title;
	private String director;
	private int year;
	private int score;
	
	public String toString() {
		return "��ȣ: "+mid+ "\n����: "+title+"\n����: "+director+
				"\n���۳⵵: "+year+"��\n����: "+score+"��";
	}
	
	public String makeID() {
		int s1 = rn.nextInt(10000)+1000;
		int s2 = rn.nextInt(10000)+1000;
		this.mid =  s1+"-"+s2;
		return mid;
	}	 
	 
	public Movie() {
		this.mid = "1234-5678";
		this.title = "��";
		this.director = "��";
		this.year = -1;
		this.score = -1;
	}
	
	public void setMid(String mid) { this.mid = makeID(); }
	public String getMid() { return mid; }
	
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	
	public void setDirector(String director) { this.director = director; }
	public String getDirector() { return director;}
	
	public void setYear(int year) { this.year = year; }
	public int getYear() { return year; }
	
	public void setScore(int score) { this.score = score; }
	public int getScore() { return score; }
	
}
