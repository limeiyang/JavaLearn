package _1baseGrammar;

public class _2_operation {
	public static void main(String[] args) {
		//1 整数运算 溢出问题
		int x = 2147483640;
		int y = 15;
		int sum = x + y;
		System.out.println("整数溢出输出 sum = "+sum);
		
		//解决上面 int 溢出的问题
		long x1 = 2147483640;
		int y1 = 15;
		long sum1 = x1 + y1;
		System.out.println("整数溢出输出 sum1 = "+sum1);
		
		//2 移位运算
		//省略
		
		//3 位运算
		//3.1 与运算 两个数都是1结果才是1
		int n1 = 0 & 0;//0
		int n2 = 0 & 1;//0
		int n3 = 1 & 1;//1
		//3.2 或运算 只要有一个1 结果就是1
		int n4 = 0 | 0;//0
		int n5 = 0 | 1;//1
		int n6 = 1 | 1;//1
		//3.3 非运算 0和1互换
		int n7 = ~0;//1
		int n8 = ~1;//0
		//3.4 异或运算 如果两个数不同 结果1 否则0
		int n9 = 0 ^ 0;//0
		int n10 = 0 ^ 1;//1
		//对两个整数进行位运算 实际上就是按位对齐对每一位进行位运算
		int i = 167776589; // 00001010 00000000 00010001 01001101
        int n = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println("整数之间的位运算"+(i & n)); // 167776512
        
        //4 强制类型转换 - 类型不一样的两个数运算 结果是较大类型的整形 
        //              如 short 和 int 计算 结果总是 int ，原因是short被强制转换为int
        // 结果强制类型转换 但是当把大范围的整数调整为小范围的整数，超过范围就会出错
        // int会直接去掉两个高位 转变为short
        int i1 = 1234567;
        short s1 = (short) i1;//-10617
        System.out.println("强制类型转换 输出 s1= "+s1);
        
        
        //5 浮点数运算
        //  浮点数在计算机中的存储会出现误差（换成二进制出现的）
        double x11 = 1.0 / 10;      // x11=0.1
        double y11 = 1 - 9.0 / 10;  //y11=0.09999999999999998
        //会发现 x y 不等
        System.out.println("浮点数运算的误差 x11="+x11+"  y11="+y11);
        //由于浮点数的误差问题 因此比较两个浮点数是否相等用等于号往往会出问题
        //正确的方法是判断两个浮点数绝对值之间的误差
        double r = Math.abs(x11 - y11);
        if(r < 0.00001) {
        	System.out.println("两数相等");
        	}else {
        		System.out.println("两数不相等");
        }
        
      //5.1 类型提升
        //   如果两个数运算 其中一个是整数，那么整数可以自动提升到浮点型
        int q = 5;
        double q1 = 10.2 / q;
        System.out.println("类型提升输出q="+q1);
        // 此处注意：
        //         复杂的四则远算中，两个整数直接计算不会自动提升
        double q2 = 1.2 + 24 / 5;//这里24除以5等于4 加1.2等于5.2
        System.out.println("类型提升输出q2="+q2);
        
        //5.2 溢出
        // 整数运算在除数为0时会报错，而浮点数在除数为0时不会报错，会返回几个特殊的值
        /*
         * NaN 表示 Not a Number
         * Infinity 表示无穷大
         * -Infinity 表示负无穷大
         */
        double d1 = 0.0 / 0;//NaN
        double d2 = 1.0 / 0;//Infinity
        double d3 = -1.0 / 0;//-Infinity
        System.out.println("浮点数溢出：d1="+d1+"   d2="+d2+"  d3="+d3);
        
        //5.3 强制转型
        //可以将浮点数强制转型为整数，在转型时，浮点数的小数部分会被丢掉。
        //    如果转型后超过了整型能表示的最大范围，将返回整型的最大值。
        int n11 = (int) 12.3; // 12
        int n21 = (int) 12.7; // 12
        int n31 = (int) -12.7; // -12
        int n41 = (int) (12.7 + 0.5); // 13
        int n51 = (int) 1.2e20; // 2147483647
        
        //6 布尔运算
        // 对于布尔类型Boolean 永远只有两个值 true 和false
        boolean isGreater = 5 > 3;//true
        int age = 12;
        boolean isZero = age == 0;//false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true
        //6.1 短路运算
        //布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
        //因为false && x的结果总是false，无论x是true还是false，因此，与运算在确定第一个值为false后，不再继续计算，而是直接返回false。
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 >0);
        System.out.println("短路运算输出result="+result);
        /*
         * 如果没有短路运算，&&后面的表达式会由于除数为0而报错，但实际上该语句并未报错，原因在于与运算是短路运算符，提前计算出了结果false。
			如果变量b的值为true，则表达式变为true && (5 / 0 > 0)。因为无法进行短路运算，该表达式必定会由于除数为0而报错，可以自行测试。
			类似的，对于||运算，只要能确定第一个值为true，后续计算也不再进行，而是直接返回true：
			boolean result = true || (5 / 0 > 0); // true
         */
        
        //7 三元运算符
        // 格式 b ? x : y
        int n111 = -100;
        int x111 = n111 > 0 ? n111 : -n111;
        //n111 > 0 为true 则执行n111 否则执行-n111; 是个取绝对值的操作
        
	}
	
}
