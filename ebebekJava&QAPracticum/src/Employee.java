
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

	
	// Çalýþanýn kendi maaþý ve bonus ile birlikte bulunan maaþ:
	public double totalSalary() {
		double totalSalary = salary + bonus();
		return totalSalary;
	}

	
	// Vergi, bonus ve çalýþanýn kendi maaþý dikkate alýnarak hesaplanan güncel maaþ:
	public double currentSalary() {
		double currentSalary = salary + bonus() - tax();
		return currentSalary;
	}

	
	public double raiseSalary() {// Vergi ve bonuslar dikkate alýnarak hesaplama yapýldý.

		double raise;// Maaþa yapýlan zam
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
		return "Çalýþanýn Ýsmi : " + name + "\nÇalýþanýn Ham Maaþý : " + salary
				+ "\nÇalýþanýn Haftalýk Çalýþma Saati : " + workHours + "\nÇalýþanýn Baþlangýç Yýlý : " + hireYear
				+ "\nÇalýþana Yapýlan Maaþ Zammý : " + raiseSalary() + "\nÇalýþanýn Toplam Maaþý : " + totalSalary()
				+ "\nÇalýþanýn Vergi ve Bonuslar ile Hesaplanan Maaþý : " + currentSalary();
	}

}
