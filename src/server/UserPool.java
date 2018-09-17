package server;

import java.util.ArrayList;

public class UserPool {
	
	private ArrayList<User> users = new ArrayList<>();
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}
	
	public ArrayList<User> getAllUsers() {
		return users;
	}
}
