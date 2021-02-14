public class Bird implements Comparable<Bird>{
	
	String type;
	int age;
	
	public Bird (String type, int age) {
		this.type = type;
		this.age = age;
	}

	@Override
	public int compareTo(Bird b) {
		// Here we specify what is going to make one bird higher or lower. 
		if (this.age < b.age) {
			return -1;
		} else if (this.age > b.age) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Bird [type=" + type + ", age=" + age + "]";
	}
	
	
}
