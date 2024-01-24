package javaprogram;

public class Customer  implements Cloneable{
	int id;
	String name,phone;
	public Customer()
	{
		super();
	}
	public Customer(int id,String name, String phone)
	{
		super();
		this.id=id;
		this.name=name;
		this.phone=phone;
	}
	public String toString()
	{
		return "Customer [Id="+id+",Name=" + name +",phone="+phone+"]";
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer customer1 =new Customer(101,"nandy","943420174");
		Customer customer2 =new Customer(102,"nandhini","94342076i4");
		System.out.println(customer1);
		System.out.println(customer2);
		Customer customer3=(Customer) customer2.clone();
		System.out.println(customer3);
	}

}
