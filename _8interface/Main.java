package _8interface;
//接口 interface  接口继承：即一个接口继承自另一个接口
public class Main {
	public static void main(String[] args) {
		Person p = new Student("limei");
		p.run();
		System.out.println(p.getName());
		/* -------一个类可实现多个接口-------
		 * 
		在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface，例如：

		class Student implements Person, Hello { // 实现了两个interface
		    ...
		}
		 */
		
		
		
		//default方法 
		Person p1 = new Student("zhangsan");
		p1.rundefault();
		/*
		 实现类可以不必覆写default方法。default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
		default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
		 */
		
	}
}

