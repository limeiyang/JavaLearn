package _6polymorphic_Override;

public class Student extends Person{
	
	@Override
	public String hello() {
		//调用父类的 hello（）方法
		return super.hello() + "!";
	}
}
