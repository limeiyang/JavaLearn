package _1baseGrammar;

import java.util.Arrays;

public class _6_arrayOperation {
	public static void main(String[] args) {
		//1 遍历数组
		//1.1 用for遍历数组
		int[] ns = {12, 23, 45, 56, 59};
		for(int i=0; i<ns.length; i++) {
			System.out.print(" "+ns[i]);
		}
		System.out.print("\n");
		//1.2 for each遍历
		for(int n : ns) {
			System.out.print(" "+ n);
		}
		System.out.print("\n");
		
		//2 打印数组内容
		//2.1 直接打印
		System.out.print("直接打印数组："+ns);//得到的是 ns在JVM中的引用地址
		//2.2 java标准库中提供了Arrays.toString(),可以快速打印数组内容
		System.out.print("\n");
		System.out.print(Arrays.toString(ns));
		
		//3 数组排序
		//3.1 用常用的算法 冒泡排序 插入排序等 略
		//3.2 java标准库中内置了排序功能 Arrays.sort()
		int[] nt = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		Arrays.sort(nt);
		System.out.print(Arrays.toString(nt));
		System.out.print("\n");
		
		//4 多维数组
		//4.1 二维数组 -就是数组的数组
		 int[][] ns2 = {
		            { 1, 2, 3, 4 },
		            { 5, 6},//二维数组里面的数组元素长度可以不相同
		            { 9, 10, 11, 12 }
		 };
		 System.out.println(ns2.length); // 3
		//可以定义一个一维数组 用ns2[0]赋值给
		 int[] arr0 = ns2[0];
		 System.out.print(Arrays.toString(ns2));//输出的是三个地址
		 System.out.print("\n");
		 System.out.print(Arrays.toString(arr0));
		 System.out.print("\n");
		 //4.2 打印二维数组
		 //方法一：两层for循环
		for(int[] arr : ns2) {
			for(int n : arr) {
				System.out.print(n);
				System.out.print(", ");
			}
			System.out.print("\n");
		}
		//方法二：使用Java标准库中的Arrays.deepToString()
		System.out.print(Arrays.deepToString(ns2));
		
		//5 命令行参数
		//Java程序入口是main方法，而main方法可以接受一个命令行参数,它是一个String[]数组
		//这个命令行参数由JVM接收用户输入并传给main方法
		for(String arg : args) {
			System.out.println("命令行参数"+arg);//此时是空的
		}
		//我们可以利用接收到的命令行参数，根据不同的参数执行不同的代码
		//实现一个-version参数，打印程序版本号
		 for (String arg : args) {
	            if ("-version".equals(arg)) {
	                System.out.println("v 1.0");
	                break;
	            }
	        }
	}
}
