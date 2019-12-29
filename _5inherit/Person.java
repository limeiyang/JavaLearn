package _5inherit;

public class Person {
	//private String name;
	//private int age;// 子类也无法访问
	protected String name;
	protected int age;//子类可以直接访问
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//空参数的构造方法
	public Person() {
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}

