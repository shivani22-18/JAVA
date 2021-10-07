import java.util.Scanner;

class Employee{
	public void salary() {
		
	}
}

class Manager extends Employee{
	public void salary() {
		
		double incentives, totalsalary, total, n;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Managers Info");
		 
		 System.out.println("Enter salary:");
		 totalsalary = sc.nextDouble();
		 
		 System.out.println("Enter incentives:");
		 incentives = sc.nextDouble();
		 
		 totalsalary = totalsalary + incentives;
		 
		 System.out.println("Enter number of managers:");
		 n = sc.nextDouble();
		 
		 total = n* totalsalary;
		 
		 System.out.println("Total salary per manager is " + totalsalary);
		 
		 System.out.println("Total salary of all managers is " + total);
		 
		 
	}
}

class Labour extends Employee{
	public void salary() {
		double ot,otAmtPerHr, totalsalary, total, n;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Labours Info");
		 System.out.println("Enter salary:");
		 totalsalary = sc.nextDouble();
		 
		 System.out.println("Enter overtime hours:");
		 ot = sc.nextDouble();
		 
		 System.out.println("Enter amt per overtime hour");
		 otAmtPerHr = sc.nextDouble();
		 
		 totalsalary = totalsalary + otAmtPerHr;
		 
		 System.out.println("Enter number of total labours:");
		 n = sc.nextDouble();
		 
		 total = n* totalsalary;
		 
		 System.out.println("Total salary per labour is " + totalsalary);
		 
		 System.out.println("Total salary of all labours is " + total);
		
	}
}

public class q2_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m=new Manager();
		m.salary();
		
		Labour l=new Labour();
		l.salary();

	}

}
