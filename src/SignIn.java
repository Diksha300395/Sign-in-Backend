public class SignIn{
	private String Email;
	private String Password;
	private String First_name;
	private String Last_Name;
	private int dob_date;
	private int dob_month;
	private int dob_year;
	private String gender;
	
	//Getter Setter for Email
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	//Getter Setter for Password
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	//Getter Setter for First_name
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String First_name) {
		this.First_name = First_name;
	}
	
	//Getter Setter for Last_Name
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	
	//Getter Setter for dob_Date
	public int getdob_date() {
		return dob_date;
	}
	public void setdob_date(int dob_date){
		if (dob_date > 0 && dob_date < 32 ) {
		this.dob_date = dob_date;}
		else {
		System.out.println("Invalid date");}
	}
	
	//Getter Setter for dob_month
	public int getdob_month() {
		
		return dob_month;
	}
	public void setdob_month(int dob_month){
		if (dob_month > 0 && dob_month < 13 ) {
		this.dob_month = dob_month;}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	//Getter Setter for dob_year
	public int getdob_year() {
		return dob_year;
	}
	public void setdob_year(int dob_year){
		this.dob_year = dob_year;
	}
	
	//Getter Setter for gender
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public SignIn(String Email, String Password, String First_name, String Last_Name, int dob_date, int dob_month , int dob_year, String gender) {
		super();
		this.Email = Email;
		this.Password = Password;
		this.First_name = First_name;
		this.Last_Name = Last_Name;
		this.dob_date = dob_date;
		this.dob_month = dob_month;
		this.dob_year = dob_year;
		this.gender = gender;
	
}
)
