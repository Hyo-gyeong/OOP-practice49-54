//컴퓨터학과 20190975 신효경
public class Date {

	private int year; 
	private int month; 
	private int day;
	
	public String toString() {
		return "당신의 생일은 "+year+"년 "+month+"월 "+day+"일 입니다.\n"+
				"당신의 성년일은 "+(year+20)+"년 "+month+"월 "+day+"일 입니다.\n";
	} // 설정자 메소드 수정 // 접근자 메소드
	 public void setYear(int year) 
	 {
		this.year = year;
	 }
	 public int getYear()
	 {
		 return year;
	 }
	 
	 public void setMonth(int month) 
	 {
		this.month = month;
	 }
	 public int getMonth()
	 {
		 return month;
	 }
	 
	 public void setDay(int day) 
	 {
		this.day = day; 
	 }
	 public int getDay()
	 {
		 return day;
	 }

}
