package _5inherit;

//Java 只允许一个class继承一个类，一个类有且仅有一个父类
public class Student extends Person{
	/**
	 *  继承Person
	 *name; age 
	 */
	private int score;
	
	
	public String hello() {
		return "hello " + super.name;
		//这里的super.name 就是表示 超类（父类）的name;
				//这里可以等同于this.name 或者 name;
				// 但是有时必须加super 如下：
	}
	
	//必须加super
	/*
	 * public Student(String name, int age, int score) {
        	this.score = score;
    	}
    	此时会报错 -- 因为系统默认会在子类中调用父类的构造方法
    	
    	public Student(String name, int age, int score) {
        	super(); // 自动调用父类的构造方法
        	this.score = score;
    	}
    	但是此时Person中并没有无参数的构造方法-故报错
	 * 
	 */
	public Student(String name, int age, int score) {
		super(name, age);//主动调用父类的构造方法Person(String name, int age)
		this.score = score;	
	}
	
	//空参数的调用函数
	public Student() {
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
