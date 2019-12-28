package _1baseGrammar;
import java.util.Scanner;

public class _5_control {
	public static void main(String[] agrs) {
		//1 輸入和輸出
		System.out.println("输出并换行 print line");
		System.out.print("输出不换行");
		System.out.print("--不换行--");
		System.out.println("");
		
		//1.1 格式化输出 System.out.printf()
		double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数
		/*
		 *  %d	格式化输出整数
			%x	格式化输出十六进制整数
			%f	格式化输出浮点数
			%e	格式化输出科学计数法表示的浮点数
			%s	格式化字符串
		 */
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
		
        //1.2 输入
        //需要import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);//create Scanner object
        System.out.print("please input your name:");//print tips
        String names = scanner.nextLine();//read a line and get string
        System.out.print("please input your age:");//print tips
        int age = scanner.nextInt();//读取一行并获取整数
        System.out.printf("Hi, %s, you are %d",names, age);
        /*
         *  首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。
			然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
			有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
         */
        
        //1.3 判断引用类型是否相等
        /*
         * 在Java中，判断值类型的变量是否相等，可以使用==运算符。但是，判断引用类型的变量是否相等，
         * ==表示“引用是否相等”，或者说，是否指向同一个对象。例如，下面的两个String类型，它们的内容是相同的，
         * 但是，分别指向不同的对象，用==判断，结果为false
         */
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        //判断引用类型是否相等 可以用equals()方法
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        // 注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException：
        //解决方法 1：
        String s11 = null;
        if(s11 != null && s11.equals("hello")) {
        	System.out.println("hello");
        }
        //解决方法2：
        //还可以把一定不是null的对象"hello"放到前面：例如：if ("hello".equals(s)) { ... }。
		
        //2 switch
        int option = 99;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
            System.out.println("Selected 2");
            break;
        case 3:
            System.out.println("Selected 3");
            break;
        default:
            System.out.println("Not selected");
            break;
        }
        //2.1 switch 表达式
        /*
         * 使用switch时，如果遗漏了break，就会造成严重的逻辑错误，而且不易在源代码中发现错误。
         * 从Java 12开始，switch语句升级为更简洁的表达式语法，使用类似模式匹配（Pattern Matching）的方法，
         * 保证只有一种路径会被执行，并且不需要break语句：
         * 
         */
        /* java12 才可以用
        String fruit = "apple";
        switch (fruit) {
        case "apple" -> System.out.println("Selected apple");
        case "pear" -> System.out.println("Selected pear");
        case "mango" -> { //多条语句用{}
            System.out.println("Selected mango");
            System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }
        
        //switch表达式还可以返回值
         String fruit = "apple";
         int opt = switch (fruit) {
         	case "apple" -> 1;
         	case "pear", "mango" -> 2;
         	default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);
        
        //switch yield 
         	//大多数时候，在switch表达式内部，我们会返回简单的值。
			//但是，如果需要复杂的语句，我们也可以写很多语句，放到{...}里，
			//然后，用yield返回一个值作为switch语句的返回值：
		String fruit = "orange";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.println("opt = " + opt); 
         
        */
        
        //3 for each
        //用普通的for去遍历数组
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            System.out.println(ns[i]);
        }
        // java 提供了简单的遍历数组的方式for each(可遍历数组，list，map）
        for (int n1 : ns) {
            System.out.println(n1);
        }
        
	}
}
