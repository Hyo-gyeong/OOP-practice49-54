//컴퓨터학과 20190975 신효경
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
		this(0, "모름", 0);
	}
	
	public Plane(int id, String model, int capacity) 
	{		
		setId(id);
		setModel(model);
		setCapacity(capacity);
	}
	
	public String toString()
	{
		return "식별번호: "+id+"편\n모델: "+model+"\n승객수: "+capacity+"명"; 
	}
}
