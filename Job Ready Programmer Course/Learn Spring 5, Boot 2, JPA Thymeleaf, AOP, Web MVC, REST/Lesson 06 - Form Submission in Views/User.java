package domain;

public class User {

	private String fullName;
	private int age;
	private String favoriteAnimal;

	public User() {	
	}
	
	public User(String fullName, int age, String favoriteAnimal) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.favoriteAnimal = favoriteAnimal;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}
	public void setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
	}
	
	
}
