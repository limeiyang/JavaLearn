package _5inherit;

public class Main {
	public static void main(String[] args) {
		// 向上转型
		Person p = new Student();
		//这是因为Student继承自Person，因此，它拥有Person的全部功能。Person类型的变量，如果指向Student类型的实例，对它进行操作，是没有问题的！
		//例如
		Student s = new Student();
		Person p11 = s;//OK
		Object o1 = p11;//OK
		Object o2 = s;//OK
		//因为继承树中 Student > Person > Object 
		
		//向下转型--将一个父类类型强制转换为子类类型
		Person p1 = new Student(); // upcasting, ok
		Person p2 = new Person();
		Student s1 = (Student) p1; // ok
		//Student s2 = (Student) p2; // runtime error! ClassCastException!
		/*
		 * Person类型p1实际指向Student实例，Person类型变量p2实际指向Person实例。在向下转型的时候，把p1转型为Student会成功，
		 * 因为p1确实指向Student实例，
		 * 把p2转型为Student会失败，因为p2的实际类型是Person，不能把父类变为子类，因为子类功能比父类多，多的功能无法凭空变出来。
			因此，向下转型很可能会失败。失败的时候，Java虚拟机会报ClassCastException。
		 */
		//为了避免向下转型出错
		
	}
}
