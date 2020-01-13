package _6polymorphic_Override;

public class Main {
	public static void main(String[] args) {
		// 1.��̬ ��д object ���� ---Person
		/*
		 * toString():��instance���ΪString
		 * equals():�ж�����instance�Ƿ��߼����
		 * hashCode():����һ��instance�Ĺ�ϣֵ
		 */
		Person o = new Person();
		o.setName("li");
		System.out.println("��д equals "+o.equals("li"));//false
		//����Ҫ��Person����
		Person o1 = new Person();
		o1.setName("li");
		System.out.println("��д equals "+o.equals(o1));//true
		
		
		//2  ����Super  --- Person �� Student
		//   ������ĸ�д�����У����Ҫ���ø���ı���д�ķ���������ͨ��super�����á�
		Person o2 = new Student();
		o2.setName("lili");
		System.out.println("super "+o2.hello());
		
		//final -----
		// .1 ���಻��������������ĳ��������д �ɽ��÷������Ϊfinal
		// .2 һ���಻ϣ���κ�������̳��� �ǿɽ�������Ϊfinal
		// .3 ��һ�����ʵ���ֶΣ���ʼ����ϣ�����޸� ��final����
		/**
		 * .1------
				class Person {
				    protected String name;
				    public final String hello() {
				        return "Hello, " + name;
				    }
				}
			
			.2------
				final class Person {
				    protected String name;
				}
		    
		    .3-------
				class Person {
				    public final String name;
				    public Person(String name) {
				        this.name = name;
				    }
				}
		 */
	}
	
	
}
