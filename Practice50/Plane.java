//��ǻ���а� 20190975 ��ȿ��
public class Plane {
	private int id, capacity;
	private String model;
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
	
	public Plane()
	{
		this(0, "��", 0);
	}
	
	public Plane(int id, String model, int capacity) 
	{		
		setId(id);
		setModel(model);
		setCapacity(capacity);
	}
	
	public String toString()
	{
		return "�ĺ���ȣ: "+id+"��\n��: "+model+"\n�°���: "+capacity+"��"; 
	}
}
