package _9staticfield;

public class Person {
	private String name;
	private int age;
	
	//静态字段
	public static int number;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//静态方法
	public static void setNumber(int value) {
		number = value;
		//不能用this 因为静态方法属于类 而不是属于实例
	}
}
