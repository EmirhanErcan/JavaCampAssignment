package homework;

public class UserManager {

	public void add(User user) {
		System.out.println("User added to system: " + user.getFullName());

	}

	public void update(User user) {
		System.out.println("User updated: " + user.getFullName());

	}

	public void delete(User user) {
		System.out.println("User deleted to system: " + user.getFullName());

	}
	
	public void addMultiple(User[] user) {
		for (User users : user) {
			add(users);
			
		}

	}

}
