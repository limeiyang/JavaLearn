package _6polymorphic_Override;

public class Student extends Person{
	
	@Override
	public String hello() {
		//���ø���� hello��������
		return super.hello() + "!";
	}
}
