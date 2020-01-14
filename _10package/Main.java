package _10package;

// 导入 _8interface.Student
import _8interface.Student;

// 导入 _9staticfield下面的所有class 不包括子类 用 *
import _9staticfield.*;

// import static 导入静态字段和方法
import static java.lang.System.*;
// 导入System类的所有静态字段和静态方法:
// 相当于调用System.out.println(…)
// out.println("Hello, world!");

//1 包  申明自己的 包
// 在Java虚拟机中，JVM只看完整类名，因此，只要包名不同，类就不同。
// 包可以是多层结构，用.隔开。例如：java.util
// 包没有父子关系。java.util和java.util.zip是不同的包，两者没有任何继承关系。
// 没有定义包名的class，它使用的是默认包，非常容易引起名字冲突，因此，不推荐不写包名的做法。

//2 包作用域
// 同一个包中的方法等class可以直接在各个class中使用

public class Main {
	//3 import
	// 在一个class中 总需要引用起他的class
	// 例如 _10package.Main (就是这个类) 需要引用 _8interface.Student
	// 3.1 直接写出完整类名 较为复杂
	public void run() {
		_8interface.Student s = new _8interface.Student("ddd");
	}
	// 3.2 import 语句 导入包_8interface.Student 然后直接写简单的类名
	public void run1() {
		Student s = new Student("ddd1");
	}
}

// 4 Java编译器编编译.class顺序
/*
 * 在代码中，当编译器遇到一个class名称时：
 * 
 * 如果是完整类名，就直接根据完整类名查找这个class；

   如果是简单类名，按下面的顺序依次查找：

   查找当前package是否存在这个class；

   查找import的包是否包含这个class；

   查找java.lang包是否包含这个class。

   如果按照上面的规则还无法确定类名，则编译报错。
 */
