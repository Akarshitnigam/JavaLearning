package encapsulation;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Akarshit");
		p.setAge(20);
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}
