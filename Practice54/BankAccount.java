//��ǻ���а� 20190975 ��ȿ��
import java.util.Random;
public class BankAccount {

	Random rn = new Random();
	
	private String name, accountNo; 
	private int balance; 
	private double interest;

	public void setName(String name) {this.name = name; }
	public String getName() {return name;}
	
	public void setAccountNo(String accountNo){this.accountNo = makeID(); }
	public String getAccountNo() { return accountNo;}
	
	public void setBalance(int balance){this.balance = balance; }
	public int getBalance () { return balance; }
	
	public void setInterest(double interest){this.interest = interest; }
	public double getInterest() {return interest;}
	
	public BankAccount() {
		this.name = "��";
		this.accountNo = "1000-2345";
		this.balance = 0;
		this.interest = 0;
	}
	 public BankAccount(String name, int balance) {
		 this.name = name;
		 this.accountNo = makeID();
		 this.balance = balance;
		 this.interest = 0;
	 }
	 public BankAccount(String name, int balance, double interest) {
		 this.name = name;
		 this.accountNo = makeID();
		 this.balance = balance;
		 this.interest = interest;
	 }
	 public int calcInterest(int balance, double interest) {
		 return (int)(balance*interest/100);
	 }
	 
	 public String makeID() {
		 int s1 = rn.nextInt(1000)+1000;
		 int s2 = rn.nextInt(1000)+1000;
		 this.accountNo = s1+"-"+s2;
		 return accountNo;
	 }
	 
	 public String toString()   
	 {
		 return "�̸�: "+ name + "\n���¹�ȣ: " + accountNo 
			+ "\n�ܾ�: "+balance + "��\n������: " + interest+ "%\n����: " 
			+ calcInterest(balance, interest) + "��";
	 } 
}
