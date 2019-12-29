package _3createMethod;

public class Main {
	public static void main(String[] args) {
		
		//在实例化的时候直接构造初始化
		//即调用带参数的构造方法
		Person p = new Person("xiaohong", 18);
		System.out.println(p.getName());
		
		//调用不带参数的构造函数
		Person li = new Person();
	}
}
