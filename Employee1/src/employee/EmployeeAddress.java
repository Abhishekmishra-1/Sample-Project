package employee;
class Address {
	String city, state, country;
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}
public class EmployeeAddress {
	public static void main(String[] args)
	{
		Address address1 = new Address("Darbhanga", "Bihar", "India");
		Employee emp1 = new Employee(231, "Abhishek", address1);
		emp1.display();
	}
}