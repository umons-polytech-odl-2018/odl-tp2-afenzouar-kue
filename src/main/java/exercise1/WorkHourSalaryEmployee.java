package exercise1;

public class WorkHourSalaryEmployee extends Employee{
	private int  hourRate;

	public WorkHourSalaryEmployee(String name, int  hourRate){
		super(name);
		this.hourRate = hourRate;
	}

	public int computeSalary() {
		return this.hourRate*getWorkedHours();
	}
}
