package domain;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String favoriteAnimal;
	
	
	public User() {
		
	}


	public User(String firstName, String lastName, int age, String gender, String favoriteAnimal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.favoriteAnimal = favoriteAnimal;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}


	public void setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
	}
	
	
}
