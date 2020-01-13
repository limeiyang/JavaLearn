package _6polymorphic;

public class Main {
	public static void main(String args[]) {
		//1. ��д ���ڼ̳й�ϵ�У��������������һ���븸�෽��ǩ����ȫ��ͬ�ķ���������Ϊ��д��Override��
		// ��̬  --�����˸�д �������� --�� Person �� �� student ����
		// ����run
		Person p1 = new Person();
		p1.run();//Person.run
		Person p2 = new Student();
		p2.run();//Student.run
		
		// Override��Overload��ͬ���ǣ��������ǩ�������ͬ������Overload(����)��Overload������һ���·������������ǩ����ͬ�����ҷ���ֵҲ��ͬ������Override��
		// ��������ͬ������������ͬ������������ֵ��ͬ��Ҳ�ǲ�ͬ�ķ�������Java�����У���������������������ᱨ��
		
		/*
		 * ---------------��̬����--------------------------------------------
		 *  ���������� --Java��ʵ�����������ǻ�������ʱ��ʵ�����͵Ķ�̬���ã����Ǳ������������͡�
			����ǳ���Ҫ������������������г�֮Ϊ��̬������Ӣ��ƴд�ǳ����ӣ�Polymorphic
		 * 
		 */
		
		// 2 ���ؼ�  _4methodOverloading
		
		
		/*3 ��̬��;--------�� Income   Salary  StateCouncilSpecialAllowance
		 *   ���ǵ�����---  ��˰����  
		 */
		// ��һ������ͨ���롢������������ܹ���Ժ���������С�����˰:
		//----���巽�� �������治ͬ���Ͷ���
		Income[] incomes = new Income[] {
			new Income(3000),
			new Salary(7500),
			new StateCouncilSpecialAllowance(15000)
		};
		System.out.println(totalTax(incomes));
		/*
		 * �۲�totalTax()���������ö�̬��totalTax()����ֻ��Ҫ��Income�򽻵�������ȫ����Ҫ֪��Salary��StateCouncilSpecialAllowance�Ĵ��ڣ�
		 * �Ϳ�����ȷ������ܵ�˰���������Ҫ����һ�ָ�����룬
		 * ֻ��Ҫ��Income������Ȼ����ȷ��дgetTax()�����Ϳ��ԡ����µ����ʹ���totalTax()������Ҫ�޸��κδ��롣
		 */
		
	}
	//��˰
	public static double totalTax(Income...incomes) {
		double total = 0;
		for(Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}
	
}
