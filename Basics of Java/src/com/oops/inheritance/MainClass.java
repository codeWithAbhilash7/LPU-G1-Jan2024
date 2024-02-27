package com.oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Nikita", 54788.54);
//		e1.setAddress("Mumbai");
//		System.out.println("Salary=" + e1.calculateSalary());

		Employee[] emp = new Employee[3];
		emp[0] = new Programmer("Nikita", 54788.54);
		emp[0].setAddress("Bengaluru");
//		System.out.println(emp[0]);
//
//		System.out.println("Total Employee Count = " + Programmer.getEmployeeCount());

		emp[1] = new SalesPerson("Rakesh", 50000.00, 4000.00);
		emp[1].setAddress("Noida");

		emp[2] = new HR("Rakesh", 22200.00);

//		if (emp[2].equals(emp[0])) {
//			System.out.println("EQUAL!!!");
//		} else {
//			System.out.println("NOT EQUAL!!!");
//		}

		// type casting
//		SalesPerson temp = (SalesPerson) emp[1];
//		temp.setNoOfSales(3);

		for (int i = 0; i < emp.length; i++) {
			if (emp[i] instanceof SalesPerson) {
				SalesPerson temp = (SalesPerson) emp[i];
				temp.setNoOfSales(3);
			} else if (emp[i] instanceof HR) {
				HR hr = (HR) emp[i];
				hr.setIncentive(7800);
			}

			System.out.println(emp[i]);
		}

	}

}
