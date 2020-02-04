package Beans;

public class Person {

	private String Pname;
	private String Address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
public void Display()
{
System.out.println("Name Is "+ Pname + " Address is "+Address);	
}
	
}
