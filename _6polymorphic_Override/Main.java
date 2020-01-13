package _6polymorphic_Override;

public class Main {
	public static void main(String[] args) {
		// 1.多态 覆写 object 方法 ---Person
		/*
		 * toString():把instance输出为String
		 * equals():判断两个instance是否逻辑相等
		 * hashCode():计算一个instance的哈希值
		 */
		Person o = new Person();
		o.setName("li");
		System.out.println("覆写 equals "+o.equals("li"));//false
		//必须要是Person对象
		Person o1 = new Person();
		o1.setName("li");
		System.out.println("覆写 equals "+o.equals(o1));//true
		
		
		//2  调用Super  --- Person 和 Student
		//   在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用。
		Person o2 = new Student();
		o2.setName("lili");
		System.out.println("super "+o2.hello());
		
		//final -----
		// .1 父类不允许子类对其进行某个方法覆写 可将该方法标记为final
		// .2 一个类不希望任何其他类继承它 那可将该类标记为final
		// .3 对一个类的实例字段，初始化后不希望被修改 用final修饰
		/**
		 * .1------
				class Person {
				    protected String name;
				    public final String hello() {
				        return "Hello, " + name;
				    }
				}
			
			.2------
				final class Person {
				    protected String name;
				}
		    
		    .3-------
				class Person {
				    public final String name;
				    public Person(String name) {
				        this.name = name;
				    }
				}
		 */
	}
	
	
}
