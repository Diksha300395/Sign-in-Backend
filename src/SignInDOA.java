import java.util.ArrayList;
class SignInDOA {
	
	private ArrayList<SignIn> SignInList = new ArrayList<>();
			
	public void addEntry(SignIn Entry) {
		SignInList.add(Entry);
	}
		
	//remove contact by first_name
	public void removeContact(String firstname) {
		for (SignIn entry : SignInList) 
		{
			if (entry.getFirst_name() == firstname)
			{
					
			}
			}	
		}
		
		public void updateContact(SignIn contact) {
	
		}
		
		public void printContacts(){
			for (SignIn contact : SignInList) 
				System.out.println(contact.getFirst_name());
		}
		
		//   CRUD
		//Add method     -   Create
		//Print Contacts   - Retreive
		//Update           - Update 
		//Remove contact   - Delete
		
	}

