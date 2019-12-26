package _1baseGrammar;

/**
 * 可以用来自动创建文档的注释
 * @author 、limeiyang
 *
 */
public class _1_dataType {
	public static void main(String[] args) {
		
		//1.第一个程序 hello world
		System.out.println("hello world");
		
		//2.变量
		//2.1基本类型的变量
		/*
		整数类型：byte(1字节) short（2字节） int（4字节） long（8字节）
		浮点数类型：float（4字节） double（8字节）
		字符类型：char（2字节）
		布尔类型：boolean (理论上1 bit，但是JVM表示为4字节整数)
		*/
		int n = 100;
		System.out.println("n = " + n);
		//整型变量的各种定义
		int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制0x表示的16711680
        int i5 = 0b1000000000; // 二进制0b表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println("整型输出：i="+i+"  i3="+i3+"  i4="+i4);
        //浮点型的各种定义
        float f1 = 3.14f;// 浮点型结尾要加f
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println("浮点数输出：f2="+f2);
        //布尔类型
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; //计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; //计算结果为false
        System.out.println("boolean；类型输出:isGreater="+isGreater);
		//字符类型
        char a = 'A'; //可表示标准的ASCII...注意单引号
        char zh = '中'; //也可以表示一个 Unicode 字符
        System.out.println("字符类型输出 a = "+a+"  zh = "+zh);
        
        // 常量
        final double PI = 3.14; //在定义的之前加上final 就是常量了
        double r = 5.0;
        double area = PI * r * r;//常量不能被重新赋值，会导致编译错误
        System.out.println("常量输出 area = "+ area);
        
        // var 关键字
        /* 主要是是省略类型名字过长的定义
         * 如 StringBuilder sb = new StringBuilder();
         * 可以 var sb = new StringBuilder();
         * 编译器会自动的推断sb的类型是StringBuilder
         */
	}
}
