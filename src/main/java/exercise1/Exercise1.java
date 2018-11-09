package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		 FixedSalaryEmployee employee = new FixedSalaryEmployee(name,fixedSalary);
		 return employee;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		BaseSalaryPlusCommissionEmployee employee = new BaseSalaryPlusCommissionEmployee(name,baseSalary,commission);
		return employee;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		WorkHourSalaryEmployee employee = new WorkHourSalaryEmployee(name,hourlyRoute);
		return employee;
	}
}
