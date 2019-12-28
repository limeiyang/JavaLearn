package _1baseGrammar;

public class _4_array {
	public static void main(String[] args) {
		//1 用数组表示一组int类型
		int[] ns = new int[5];
		 ns[0] = 68;
	     ns[1] = 79;
	     ns[2] = 91;
	     ns[3] = 85;
	     ns[4] = 62;
	     /*
	      * 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
			数组一旦创建后，大小就不可改变。
			数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错
	      */
	     //用.length 获取数组的大小
	     System.out.println("数组大小为：ns.length="+ns.length);
	     //也可在定义数组时直接指定初始化的元素，这样就不必写出数组的大小，由编译器自动推算
	     int[] nt = new int[] {68, 34,34,55,3};
	     System.out.println("数组长度nt.length="+nt.length);
	     
	     //1.1  大小不可变
	     int[] ns1;
	     ns1 = new int[] { 68, 79, 91, 85, 62 };
	     System.out.println(ns1.length); // 5
	     ns1 = new int[] { 1, 2, 3 };
	     System.out.println(ns1.length); // 3
	     //数组是引用类型，并且数组大小不可变
	     // 实际只是ns1指向的数组改变 大小为5的数组还在内存中，没有改变，只是不能用ns1去引用他
	     
	     //2 字符串数组
	     String[] names = {
	    		 "ABC","xyz","zoo"
	     };
	     //对于names 包含了三个元素 每个元素分别是一个字符串类型的数据
	     //由于数组是引用类型的，因此对names[0]进行重新赋值，即names[0]="cat";
	     //只是将names[0]指向改到cat，而ABC还存在原来的位置。
	     String[] names1 = {"ABC", "XYZ", "zoo"};
	        String s = names1[1];
	        names1[1] = "cat";
	        System.out.println(s); // s是"XYZ"还是"cat"? 是XYZ
	     
	     
	     
	     
	}
}
