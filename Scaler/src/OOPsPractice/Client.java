package OOPsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Chidvi", 26, 1000000.00));
		employees.add(new Employee(2, "Raju", 45, 3000000.00));
		employees.add(new Employee(3, "Adhi", 30, 2500000.00));
		employees.add(new Employee(4, "Santosh", 28,3500000.00));
		employees.add(new Employee(5, "Prudvi", 20, 1000000.00));
		employees.add(new Employee(6, "Avi", 60, 3300000.00));
		employees.add(new Employee(7, "Prasad", 29, 4500000.00));
		List<Employee> res = employeeSalAboveRange(employees, 3000000.00);
		int c=100;
		HashMap<Integer, Employee> empMap = new HashMap();
		for(Employee emp:employees) {
			empMap.put(c++, emp);
		}
		
		empMap.forEach((k,v)->System.out.println(k+" : "+v));
		System.out.println("----------------------------------");
		for(int key:empMap.keySet()) {
			System.out.println(key+": "+empMap.get(key));
		}
	}
	private static List<Employee> employeeSalAboveRange(List<Employee> employees,double range) {
		List<Employee> resEmp = new ArrayList<Employee>();
		for(Employee emp:employees) {
			if(emp.getSalary()>range) {
				resEmp.add(emp);
			}
		}
		return resEmp;
		
	}
}
