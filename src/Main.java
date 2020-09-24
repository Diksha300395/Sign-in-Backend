public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				SignInDOA SignInList = new SignInDOA();
				SignIn user1 = new SignIn("happy@gmail.com","Happy123","Happy","J",30,4,2000,"Male");
				SignIn user2 = new SignIn("sweety@gmail.com","Sweety12345","Sweety","Jha",03,5,1998,"Female");
				SignIn user3 = new SignIn("tweety@gmail.com","tweety03","tweety","raichandani",9,10,2004,"Female");

				
				SignInList.addEntry(user1);
				SignInList.addEntry(user2);
				SignInList.addEntry(user3);
				SignInList.printContacts();		
	}
}

