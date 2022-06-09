package Intro;

public class ContructorEx {
	int age;

	public ContructorEx(String name) {
		System.out.println("The name is " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		ContructorEx human1 = new ContructorEx("Hitesh");
		human1.setAge(24);
		System.out.println(human1.getAge());
	}

}
