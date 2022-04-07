package encapsulation;

public class Person {

	  private String name; // private = restricted access
	  private int age;
	  public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
}
