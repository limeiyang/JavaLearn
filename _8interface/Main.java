package _8interface;
//�ӿ� interface  �ӿڼ̳У���һ���ӿڼ̳�����һ���ӿ�
public class Main {
	public static void main(String[] args) {
		Person p = new Student("limei");
		p.run();
		System.out.println(p.getName());
		/* -------һ�����ʵ�ֶ���ӿ�-------
		 * 
		��Java�У�һ����ֻ�ܼ̳�����һ���࣬���ܴӶ����̳С����ǣ�һ�������ʵ�ֶ��interface�����磺

		class Student implements Person, Hello { // ʵ��������interface
		    ...
		}
		 */
		
		
		
		//default���� 
		Person p1 = new Student("zhangsan");
		p1.rundefault();
		/*
		 ʵ������Բ��ظ�дdefault������default������Ŀ���ǣ���������Ҫ���ӿ�����һ������ʱ�����漰���޸�ȫ�����ࡣ�����������default��������ô����Ͳ���ȫ���޸ģ�ֻ��Ҫ����Ҫ��д�ĵط�ȥ��д����������
		default�����ͳ��������ͨ������������ͬ�ġ���Ϊinterfaceû���ֶΣ�default�����޷������ֶΣ������������ͨ�������Է���ʵ���ֶΡ�
		 */
		
	}
}

