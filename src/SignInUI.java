import java.util.Scanner;

public class SignInUI {
	
	public static void main(String[] args) {
		System.out.println("This is the Account sign up page.\n");
		
		System.out.println(" ******** \n");	
		SignIn new_user = new SignIn();
		Scanner scan = new Scanner(System.in);
		
		inputFirstName(new_user, scan);
		inputLastName(new_user, scan);
		inputEmailAddress(new_user, scan);
		inputPassword(new_user, scan);
		inputDay(new_user, scan);
		inputMonth(new_user, scan);
		inputYear(new_user, scan);
		inputGender(new_user, scan);
		
		
		System.out.println("******* \n "
				+ "User created successfully!");
		
		SignInDAO users = new SignInDAO();
	    users.addUser(new_user);
	    users.printUserInfo(new_user);
	}
	
	private static void inputFirstName(SignIn new_user, Scanner scan) {
		System.out.println("Enter your first name:");
		while (true) {
			String s = scan.next();
			new_user.setFirst_name(s);
			if (s.toLowerCase().equals(new_user.getFirst_name())) {
				break;
			}
			System.out.println("Enter a valid first name: ");
		}
		System.out.println();
	}
	
	private static void inputLastName(SignIn new_user, Scanner scan) {
		System.out.println("Enter your Last name:");
		while (true) {
			String s = scan.next();
			new_user.setLast_Name(s);
			if (s.toLowerCase().equals(new_user.getLast_Name())) {
				break;
			}
			System.out.println("Enter a valid Last name: ");
		}
		System.out.println();
	}
	
	private static void inputEmailAddress(SignIn new_user, Scanner scan) {
		System.out.println("Enter your Email Address:");
		while (true) {
			String s = scan.next();
			new_user.setEmail(s);
			if (s.equals(new_user.getEmail())) {
				break;
			}
			System.out.println("Enter a valid Email Address");
		}
		System.out.println();
	}
	
	private static void inputPassword(SignIn new_user, Scanner scan) {
		System.out.println("Enter your Password:");
		while (true) {
			String s = scan.next();
			new_user.setPassword(s);
			if (s.equals(new_user.getPassword())) {
				break;
			}
			System.out.println("Enter a valid Password");
		}
		System.out.println();
	}
	private static void inputDay(SignIn new_user, Scanner scan) {
		int day = 0;
		System.out.println("Enter your birth Date: ");
		day = scan.nextInt();
		new_user.setdob_date(day);
	}
	private static void inputMonth(SignIn new_user, Scanner scan) {
		int month = 0;
		System.out.println("Please enter your birth Month: ");
		month = scan.nextInt();
		new_user.setdob_month(month);
	}
	private static void inputYear(SignIn new_user, Scanner scan) {
		int year = 0;
		System.out.println("Please enter your birth year: ");
		year = scan.nextInt();
		new_user.setdob_year(year);
	}
	

	
	private static void inputGender(SignIn new_user, Scanner scan) {
		System.out.println("Please choose a gender: ");
		String s = scan.next();
		new_user.setgender(s);
	
	}


}
