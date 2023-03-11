package bl.com;

public class EmployeePayRollData {

	int Id;
	String name;
	double Salary;
	
	public EmployeePayRollData(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeePayRollData [Id=" + Id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	



	
}
