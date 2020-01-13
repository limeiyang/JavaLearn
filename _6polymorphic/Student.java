package _6polymorphic;

public class Student extends Person {
	// 1 . 覆写（Override）
	// 加上@Override可以让编译器帮助检查是否进行了正确的覆写。希望进行覆写，但是不小心写错了方法签名，编译器会报错。
	@Override
	public void run() {
		System.out.println("Student.run");
	}
}
