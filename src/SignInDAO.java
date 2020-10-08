import java.util.ArrayList;
public class SignInDAO {
	public ArrayList<SignIn> userData = new ArrayList<SignIn>();
	
	//Create / insert a User
	public void addUser(SignIn user) {
		userData.add(user);
	}
	
	// Delete a user by it's email
	public void deleteUser(String email) {
		SignIn user = findUser(email);
		if (user == null) {
			return;
		}
		System.out.println("Deleted User entry: \n");
		userData.remove(user);
		
	}
	
	// find first user by email. Return null if such user doesn't exist
	public SignIn findUser(String email) {
		for (int i = 0; i < userData.size(); i++) {
			if (userData.get(i).getEmail().equals(email)) {
				printUserInfo(userData.get(i));
				return userData.get(i);
			}
		}
		System.out.println("User does not exist.");
		return null;
	}
	
	// print a user information
	public void printUserInfo(SignIn user) {
		System.out.println("User Details:");
		System.out.println("First name : " + user.getFirst_name());
		System.out.println("Last name : " + user.getLast_Name());
		System.out.println("Birthday : " + user.getdob_month() + "/"+user.getdob_date() + "/"+ user.getdob_year()  );
		System.out.println("Email : " + user.getEmail()); 
	}
	
	// print all users
	public void printAll() {
		System.out.println("Print all users : \n");
		for (int i = 0; i < userData.size(); i++) {
			System.out.println("No." + (i + 1) + " user: ");
			printUserInfo(userData.get(i));
			System.out.println("********");
		}
		System.out.println();
	}

}
