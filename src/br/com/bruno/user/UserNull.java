package br.com.bruno.user;

public class UserNull extends User {

	@Override
	public String getName() {
		return "unnamed";
	}

	@Override
	public int getAge() {
		return 0;
	}

	@Override
	public float getHeight() {
		return 0;
	}
}
