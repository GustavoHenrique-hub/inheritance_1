package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter de number of employees: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n) ? ");
			char outsourced = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Hours: ");
			Integer hours = scan.nextInt();
			System.out.print("Value per hour: ");
			Double valPerHour = scan.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double addCharge = scan.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valPerHour, addCharge));
			}else {
				employees.add(new Employee(name, hours, valPerHour));
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Employee #" + (i + 1) + " data: ");
//			System.out.print("Outsourced (y/n) ? ");
//			String outsourced = scan.next();
//			if(outsourced.equalsIgnoreCase("y")) {
//				scan.nextLine();
//				System.out.print("Name: ");
//				String name = scan.nextLine();
//				System.out.print("Hours: ");
//				Integer hours = scan.nextInt();
//				System.out.print("Value per hour: ");
//				Double valPerHour = scan.nextDouble();
//				System.out.print("Additional charge: ");
//				Double addCharge = scan.nextDouble();
//				
//				Employee e1 = new OutsourcedEmployee(name, hours, valPerHour, addCharge);
//				
//				employees.add(e1);
//			}else {
//				scan.nextLine();
//				System.out.print("Name: ");
//				String name = scan.nextLine();
//				System.out.print("Hours: ");
//				Integer hours = scan.nextInt();
//				System.out.print("Value per hour: ");
//				Double valPerHour = scan.nextDouble();
//				
//				Employee e1 = new Employee(name, hours, valPerHour);
//				
//				employees.add(e1);
//			}
//		}
		
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}
		
		scan.close();
	}

}
