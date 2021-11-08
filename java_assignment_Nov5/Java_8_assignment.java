package java_assignment_Nov5;

/*
 * EMp(id,name,dept,year of joining,salary)
 * Emp -> 111,"abc",24,Male,CS,2010,2021,12345);
 * 
 * i. how many m/f employees?
 * ii. avg age of m & f employees
 * iii. find the highest paid employee in the emp class
 * iv. list all the names of employees who have joined after 2016 
 * v. find the most senior employee in the class 
 * vi.count the number of emp in each department 
 * vii. find how many f/m employes in the CS department nad Mechanical department 
 * viii.find the avg salary of m/f employees 
 * ix. differentiate the employees who are younger or equal to 30yrs old 
 * x.List the names of all employees in each department 
 */
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	int id;
	String name;
	String dept;
	int yearOfJoining;
	double salary;
	int age;
	String gender;

	/*
	 * public Employee() { }
	 */

	public Employee(int id1, String name1, int age1, String gender1, String dept1, int yearOfJoining1, double salary1) {
		id = id1;
		name = name1;
		dept = dept1;
		age = age1;
		gender = gender1;
		yearOfJoining = yearOfJoining1;
		salary = salary1;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + "\nName : " + name + "\nAge : " + age + "\nGender : " + gender + "\nDepartment : " + dept
				+ "\nYear Of Joining : " + yearOfJoining + "\nSalary : " + salary;
	}
}

/*
 * class ConcreteEmployees extends Employee { ConcreteEmployees(int id1, String
 * name1, String dept1, int age1, String gender1, int yearOfJoining1, double
 * salary1) { super(id1,name1,dept1,age1,gender1,yearOfJoining1,salary1); } }
 */
public class Java_8_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Mechanical Department", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "CS Department", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "CS Department", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Mechanical Department", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "CS Department", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Mechanical Department", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

		// i. how many m/f employees?
		System.out.println("i. How many male & female employees?");
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		// ii. avg age of m & f employees
		System.out.println("ii. Average age of male & female employees?");
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		// iii. find the highest paid employee in the emp class
		System.out.println("iii. Find the highest paid employee in the emp class");
		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

		System.out.println("Details Of Highest Paid Employee : ");

		System.out.println("==================================");

		System.out.println("ID : " + highestPaidEmployee.getId());

		System.out.println("Name : " + highestPaidEmployee.getName());

		System.out.println("Age : " + highestPaidEmployee.getAge());

		System.out.println("Gender : " + highestPaidEmployee.getGender());

		System.out.println("Department : " + highestPaidEmployee.getDept());

		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

		System.out.println("Salary : " + highestPaidEmployee.getSalary());

		// iv. list all the names of employees who have joined after 2016
		System.out.println("iv. List all the names of employees who have joined after 2016");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2016).map(Employee::getName)
				.forEach(System.out::println);

		// v. find the most senior employee in the class
		System.out.println("v. Find the most senior employee in the class");
		Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

		System.out.println("Senior Most Employee Details :");

		System.out.println("----------------------------");

		System.out.println("ID : " + seniorMostEmployee.getId());

		System.out.println("Name : " + seniorMostEmployee.getName());

		System.out.println("Age : " + seniorMostEmployee.getAge());

		System.out.println("Gender : " + seniorMostEmployee.getGender());

		System.out.println("Age : " + seniorMostEmployee.getDept());

		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());

		System.out.println("Salary : " + seniorMostEmployee.getSalary());

		/*
		 * vi.count the number of emp in each department vii. find how many f/m employes
		 * in the CS department nad Mechanical department viii.find the avg salary of
		 * m/f employees ix. differentiate the employees who are younger or equal to
		 * 30yrs old x.List the names of all employees in each department
		 */

		// vi. count the number of emp in each department
		System.out.println("vi. Count the number of emp in each department");
		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// vii. find how many f/m employees in the CS department and Mechanical
		// department
		System.out.println("vii. Find how many male & female employees are in the CS and Mechanical department");
		Map<String, Long> countMaleFemaleEmployeesInCSDept = employeeList.stream()
				.filter(e -> e.getDept() == "CS Department")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployeesInCSDept);

		Map<String, Long> countMaleFemaleEmployeesInMechanicalDept = employeeList.stream()
				.filter(e -> e.getDept() == "Mechanical Department")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployeesInMechanicalDept);

		// viii. find the avg salary of m/f employees
		System.out.println("viii. Find the average salary of male & female employees");
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryOfMaleAndFemaleEmployees);

		// ix. differentiate the employees who are younger or equal to 30yrs old
		System.out.println("ix. Differentiate the employees who are younger or equal to 30yrs old");
		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 30));

		Set<Entry<Boolean, List<Employee>>> entrySet1 = partitionEmployeesByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : entrySet1) {
			System.out.println("----------------------------");

			if (entry.getKey()) {
				System.out.println("Employees older than 30 years :");
			} else {
				System.out.println("Employees younger than or equal to 30 years :");
			}

			System.out.println("----------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}

		// x. List the names of all employees in each department
		System.out.println("x. List the names of all employees in each department");
		Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDept));

		Set<Entry<String, List<Employee>>> entrySet2 = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet2) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}

	}

}
