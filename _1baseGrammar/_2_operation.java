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
		
	}
}
