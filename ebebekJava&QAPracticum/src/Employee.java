
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee() {

	}

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double tax;
		if (salary <= 1000) {
			tax = 0;
		} else {
			tax = salary * 3 / 100;
		}
		return tax;
	}

	
	public double bonus() {
		double bonus;
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;
		} else {
			bonus = 0;
		}
		return bonus;
	}

	
	// �al��an�n kendi maa�� ve bonus ile birlikte bulunan maa�:
	public double totalSalary() {
		double totalSalary = salary + bonus();
		return totalSalary;
	}

	
	// Vergi, bonus ve �al��an�n kendi maa�� dikkate al�narak hesaplanan g�ncel maa�:
	public double currentSalary() {
		double currentSalary = salary + bonus() - tax();
		return currentSalary;
	}

	
	public double raiseSalary() {// Vergi ve bonuslar dikkate al�narak hesaplama yap�ld�.

		double raise;// Maa�a yap�lan zam
		int thisYear = 2021;
		int workYears = thisYear - hireYear;

		if (workYears <= 9) {
			raise = currentSalary() * 5 / 100;
		} else if (9 < workYears && workYears <= 19) {
			raise = currentSalary() * 10 / 100;
		} else {
			raise = currentSalary() * 15 / 100;
		}
		return raise;
	}

	
	public String toString() {
		return "�al��an�n �smi : " + name + "\n�al��an�n Ham Maa�� : " + salary
				+ "\n�al��an�n Haftal�k �al��ma Saati : " + workHours + "\n�al��an�n Ba�lang�� Y�l� : " + hireYear
				+ "\n�al��ana Yap�lan Maa� Zamm� : " + raiseSalary() + "\n�al��an�n Toplam Maa�� : " + totalSalary()
				+ "\n�al��an�n Vergi ve Bonuslar ile Hesaplanan Maa�� : " + currentSalary();
	}

}
