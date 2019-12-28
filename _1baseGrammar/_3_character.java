package _1baseGrammar;

public class _3_character {
	public static void main(String[] args) {
		//1 字符类型char
		// 一个char保存一个Unicode字符
		char c1 = 'A';
		char c2 = '中';
		//因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，
		//它们都占用两个字节。要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
		int n1 = 'A';//A的Unicode编码是65
		int n2 = '中';//中的Unicode的编码是20013
		// 还可以用转义字符 \ u+Unicode编码(十六进制)来表示一个字符
		char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
		char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
		System.out.println("字符输出 c3="+c3+"  c4="+c4);
		
		//2 字符串类型
		//和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符
		String s = "";//空字符串，包含0个字符
		String s1 = "A";//包含一个字符
		String s2 = "中文 ABC";//包含六个字符，其中一个是空格
		// 用转义字符 \ 
		String s3 = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z
		String s4 = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
		/*
		 * 	\" 表示字符"
			\' 表示字符'
			\\ 表示字符\
			\n 表示换行符
			\r 表示回车符
			\t 表示Tab
			\ u#### 表示一个Unicode编码的字符 
		 */
		String s5 = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
		//2.1 可以用+连接任意字符串和其他类型的数据
		String s6 = s1 + s2 + "!!!";
		System.out.println("字符串输出 s6="+s6);
		//如果用+连接其他数据类型，会先自动转换为字符串，再连接
		int age = 25;
		String s7 = "age is "+age;
		System.out.println("连接输出：s7="+s7);
		//2.2 多行字符串
		//如果要表示多行字符串，用+很不方便
		// 可以用""" ... """(Java13才有)
		String q1 = "first line \n"
				+ "second line \n"
				+ "end";
		/*
		String q2 = """
                SELECT * FROM
                users
              WHERE id > 100
              ORDER BY name DESC
              """;
              */
		System.out.println("多行字符串输出q1="+q1);
		
		//2.3 不可变特性
		//Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。
		String s11 = "hello";
        System.out.println(s11); // 显示 hello
        s11 = "world";
        System.out.println(s11); // 显示 world
        //观察执行结果，难道字符串s变了吗？其实变的不是字符串，而是变量s的“指向”。
        //执行String s = "hello";时，JVM虚拟机先创建字符串"hello"，然后，把字符串变量s指向它
		//紧接着，执行s = "world";时，JVM虚拟机先创建字符串"world"，然后，把字符串变量s指向它
        //原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变
        String u = "hello";
        String t = u;
        u = "world";
        System.out.println(t); // t是"hello"还是"world"? 是hello
        
        //2.4 空值null
        // 引用类型的变量可以指向一个空值null，他表示不存在，即该变量不指向任何对象
        String s111 = null; // s111是null
        String s21; // 没有赋初值值，s21也是null
        String s31 = s111; // s31也是null
        String s41 = ""; // s41指向空字符串，不是null
        //注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null。
        
        
	}
}
