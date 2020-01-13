package _6polymorphic;

public class Main {
	public static void main(String args[]) {
		//1. 覆写 ：在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）
		// 多态  --介绍了覆写 重载区别 --类 Person 和 类 student 介绍
		// 调用run
		Person p1 = new Person();
		p1.run();//Person.run
		Person p2 = new Student();
		p2.run();//Student.run
		
		// Override和Overload不同的是，如果方法签名如果不同，就是Overload(重载)，Overload方法是一个新方法；如果方法签名相同，并且返回值也相同，就是Override。
		// 方法名相同，方法参数相同，但方法返回值不同，也是不同的方法。在Java程序中，出现这种情况，编译器会报错。
		
		/*
		 * ---------------多态定义--------------------------------------------
		 *  由以上例子 --Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
			这个非常重要的特性在面向对象编程中称之为多态。它的英文拼写非常复杂：Polymorphic
		 * 
		 */
		
		// 2 重载见  _4methodOverloading
		
		
		/*3 多态用途--------类 Income   Salary  StateCouncilSpecialAllowance
		 *   覆盖的作用---  报税处理  
		 */
		// 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
		//----定义方法 数组里面不同类型定义
		Income[] incomes = new Income[] {
			new Income(3000),
			new Salary(7500),
			new StateCouncilSpecialAllowance(15000)
		};
		System.out.println(totalTax(incomes));
		/*
		 * 观察totalTax()方法：利用多态，totalTax()方法只需要和Income打交道，它完全不需要知道Salary和StateCouncilSpecialAllowance的存在，
		 * 就可以正确计算出总的税。如果我们要新增一种稿费收入，
		 * 只需要从Income派生，然后正确覆写getTax()方法就可以。把新的类型传入totalTax()，不需要修改任何代码。
		 */
		
	}
	//报税
	public static double totalTax(Income...incomes) {
		double total = 0;
		for(Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}
	
}
