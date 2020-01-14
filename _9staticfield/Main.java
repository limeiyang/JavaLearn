package _9staticfield;
// 静态字段和静态方法 接口的静态字段
public class Main {
	public static void main(String[] args) {
		
		// 1 静态字段
		Person li = new Person("li", 14);
		Person zhang = new Person("zhang", 19);
		
		//修改li.number
		li.number = 10;
		System.out.println(li.number);
		//查看zhang.number
		System.out.println(zhang.number);//10
		//number 为静态字段 他们并不属于实例 虽然实例可以访问静态字段，但是它们指向的其实都是Person class的静态字段。所以，所有实例共享一个静态字段。
		
	    // 不推荐用实例去访问静态字段 推荐采用类
		// 相当于静态实例是class的 而不是实例的
		System.out.println(Person.number);
		
		// 2 静态方法
		// 调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。静态方法类似其它编程语言的函数
		Person.setNumber(99);
		System.out.println(Person.number);
	}
}
