package assignment1;


import java.util.Scanner;
public class q6_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int attempts=0;
		String username="Shivani";
		String password="sp7979";
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter your username:");
			String u=scan.next();
			System.out.println("Enter your Password:");
			String p=scan.next();
			
			if(username.equals(u) && password.equals(p)) {
				System.out.println("WELCOME...!");
				break;
			}
			else {
				attempts++;
				System.out.println("Please enter correct username and password");
				System.out.println("Number of attempts left:"+(3-attempts));
			}
			if(attempts==3) {
				System.out.println("Please contact your Admin...");
				break;
			}
		}
            
	}

	}


