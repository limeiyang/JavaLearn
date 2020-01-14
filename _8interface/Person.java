package _8interface;

//在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力。
//如果一个抽象类没有字段，所有方法全部都是抽象方法
//就可以把该抽象类改写为接口：interface
interface Person {
	void run();
	String getName();
	//default方法
	default void rundefault() {
		System.out.println(getName()+"run");
	}
}
//所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）。