public class SignInUIEXAMPLE {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SignInDAO userList = new SignInDAO();
			SignIn user1 = new SignIn("diksha.waila@gmail.com", "Diksha@1234","Diksha","Waila",30,03,1995,"Female");
			SignIn user2 = new SignIn("ram.kapoor@gmail.com", "Ram@1234","Ram","Kapoor",1,1,1975,"Male");
			SignIn user3 =new SignIn("kala.sharma234@gmail.com", "Sharma@111","Kalyan","Sharma",1,11,1989,"Male");
			userList.addUser(user1);
			userList.addUser(user2);
			userList.addUser(user3);
			userList.printAll();
			userList.deleteUser("kal.mehta@gmail.com");
			userList.printAll();
		}
	}

