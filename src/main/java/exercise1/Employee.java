package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {

	private String name;
	private int sales = 0;
	private int workedHours = 0;

	public Employee(String name ){
		this.name = name;
	}

	public abstract int computeSalary();

	public void sell() { this.sales += 1;}

	public void workOneHour() {
		workedHours += 1;
	}

	public String getName() {
		return this.name;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
}
