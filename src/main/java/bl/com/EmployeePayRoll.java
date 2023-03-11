package bl.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRoll {

	public static  List<EmployeePayRollData> emppayrollList;
		
	public EmployeePayRoll() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public EmployeePayRoll(List<EmployeePayRollData> emppayrollList) {
		super();
		this.emppayrollList = emppayrollList;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ArrayList<EmployeePayRollData> emppayrollList = new ArrayList();
		EmployeePayRoll emppayroll = new EmployeePayRoll(emppayrollList);
		emppayroll.readEmpPayRoll();
		emppayroll.writeEmpPayRoll();
		
	
	}

	public static void readEmpPayRoll() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int EmpId = sc.nextInt();
		System.out.println("Enter Employee name:");
		String EmpName = sc.next();
		System.out.println("Enter Employee Salary:");
		double EmpSalary = sc.nextDouble();
		emppayrollList.add(new EmployeePayRollData(EmpId ,  EmpName , EmpSalary));
	}
	
	
	private static void writeEmpPayRoll() {
		System.out.println("Employee Pay Roll :"+emppayrollList);
}
}