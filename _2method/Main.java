package _2method;

import java.util.Arrays;

public class Main {
	public static void main(String[] agrs) {
		//实例化Person
		Person li = new Person();
		li.setName("limeiyang");
		li.setAge(10);
		System.out.println(li.getName());
		
		//两个参数的调用-Person
		Person mei = new Person();
		mei.setNameAndAge("haohao", 15);
		System.out.println(mei.getName());
		
		//可变参数 1 直接定义--- Group
		Group g = new Group();
		g.setNames1("xiaoming", "xiaohong", "xiaojun");//传入3个String
		g.setNames1("xiaoming");//传入一个string
		g.setNames1(); // 传入0个String
		
		//可变参数 2 定义数组 --Group
		Group p = new Group();
		p.setNames2(new String[] {"xiaoming", "xiaojun"});//需要先构造String[]
		
		/*
		 *     另一个问题是，调用方可以传入null：
			Group g = new Group();
			g.setNames(null);
			而可变参数可以保证无法传入null，因为传入0个参数时，接收到的实际值是一个空数组而不是null。
		 */
		
		//参数绑定
		// 参数是基本类型
		int a = 10;//Person
		li.setAge(a);
		System.out.println("参数绑定 原来的age = "+li.getAge());
		a = 15;
		System.out.println("参数绑定 修改的a后age = "+li.getAge());//age还是10 并没有变
		// 参数是引用类型
		String[] n = new String[] {"lili", "hahah", "dede"};
		g.setNames2(n);//Group
		System.out.println("参数绑定 原来的names = " + Arrays.toString(g.getNames()));
		n[0] = "我改了";//修改数组n
		System.out.println("参数绑定 修改了n 此时names = " + Arrays.toString(g.getNames()));//此时names改变了
		//结论：引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）。
		// 一个判断
		String na = "Bob";
		li.setName(na); //Person
		System.out.println("参数绑定 原来的name = "+li.getName());
		na = "limei";
		System.out.println("参数绑定 修改na后 name = "+li.getName());//还是Bob
		
	}
}
