import java.util.regex.Pattern;

public class SignIn{
	private String Email;
	private String Password;
	private String First_name;
	private String Last_Name;
	private int dob_date;
	private int dob_month;
	private int dob_year;
	private String Gender;
	
	public SignIn() {
	}
	
	public SignIn(String Email, String Password, String First_name, String Last_Name, int dob_date, int dob_month , int dob_year, String gender) {
		setEmail(Email);
		setPassword(Password);
		setFirst_name(First_name);
		setLast_Name(Last_Name);
		setdob_date(dob_date);
		setdob_month(dob_month);
		setdob_year(dob_year);
		setgender(gender);
	
}
	
	// Getter Setter for Email
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9+-._]+@+[a-zA-Z0-9.-]+.+[a-z{2:}]+$";
		Pattern pat = Pattern.compile(emailRegex);
		if(pat.matcher(email).matches() && email.length()!=0 ) {
		Email = email;
		}else {
			System.out.println("Invalid email Id try again!");
		}
	}
	
	// Getter Setter for Password
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		if(password.length()>=8) {
			int NumC = 0;
			int SpecialC = 0;
			for(int i=0;i<password.length();i++) {
				if(Character.isDigit(password.charAt(i))) {
					NumC++;
				}
				if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
					SpecialC++;
				}
			}
			if(Character.isUpperCase(password.charAt(0)) && NumC > 0 && SpecialC > 0) {
				Password = password;
			}else {
				System.out.println("The password must be 8 characters or longer with atleast 1 number, 1 special character and the first character must be uppercase");
			}
		}
		else {
			System.out.println("The password must be 8 characters or longer with atleast 1 number, 1 special character and the first character must be uppercase");
		}
	}
	
	// Getter Setter for First_name
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		int n = first_name.length();
		String str = first_name.replaceAll("[^a-zA-Z]","");
		int n1 = str.length();
		if(n==n1 && n!=0) {
			First_name = first_name;
		}else {
			System.out.println("Enter a valid name Ex:"+ first_name);
		}
	}
	
	// Getter Setter for Last_Name
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_name) {
		if(last_name.length() >= 2 && last_name != null && last_name.matches("^[a-zA-Z]*$")) {
			this.Last_Name = last_name;
				} 
		else {
			System.out.println("Enter a valid last name");	
		}
	}

	// Getter Setter for dob_Date
	public int getdob_date() {
		return dob_date;
	}
	public void setdob_date(int date){
		if (date >= 1 && date <= 31 ) {
			dob_date = date;}
		else {
		System.out.println("Invalid date");}
	}
	
	// Getter Setter for dob_month
	public int getdob_month() {
		return dob_month;
	}
	public void setdob_month(int month){
		if (month >= 1 && month <= 12 ) {
			dob_month = month;}
		else {
			System.out.println("Invalid Month");
		}
	}
	
	// Getter Setter for dob_year
	public int getdob_year() {
		return dob_year;
	}
	public void setdob_year(int year){
		if(year > 1900 && year <= 2020) {
			dob_year = year;
		}else {
			System.out.println("Invalid Year");
		}
	}
	
	// Getter Setter for gender
	public String getgender() {
		return Gender;
	}
	public void setgender(String gender) {
		gender = gender.toLowerCase();	
		if(gender.equals("male") ||gender.equals("female")  ) {
			Gender = gender;
		}else {
			System.out.println("Enter a valid gender");
		}
	}
}
