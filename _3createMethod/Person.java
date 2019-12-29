package _3createMethod;

public class Person {
	private String name; //系统初始值为null
	private int age = 30; //系统初始值为0，可以直接初始化
	
	
	//构造方法 -- 如果不定义，会自动创建
	public Person() {
		//不带参数
	}
	
	//构造方法--带参数
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//构造方法 -- 带部分参数 --调用的时候根据参数的数目类型调用
	public Person(String name) {
		this.name = name;
	}
	
	//一个构造方法可以调用其他的构造方法
	//调用方法 this(...)
	public Person(int age) {
		this("Unnamed");//调用Person(String name)
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
