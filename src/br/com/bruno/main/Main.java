package br.com.bruno.main;

import br.com.bruno.user.User;
import br.com.bruno.user.UserFactory;

public class Main {

	public static void main(String[] args) {
		User user = UserFactory.createUser(null);
		user.getAge();
		System.out.println(user.getName());
	}

}
