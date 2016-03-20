package br.com.bruno.user;

public class UserFactory {

	public static User createUser(String name) {
		if (name == null) {
			return new UserNull();
		}
		return new User();
	}

}
