package _5inherit;

public class Main {
	public static void main(String[] args) {
		// ����ת��
		Person p = new Student();
		//������ΪStudent�̳���Person����ˣ���ӵ��Person��ȫ�����ܡ�Person���͵ı��������ָ��Student���͵�ʵ�����������в�������û������ģ�
		//����
		Student s = new Student();
		Person p11 = s;//OK
		Object o1 = p11;//OK
		Object o2 = s;//OK
		//��Ϊ�̳����� Student > Person > Object 
		
		//����ת��--��һ����������ǿ��ת��Ϊ��������
		Person p1 = new Student(); // upcasting, ok
		Person p2 = new Person();
		Student s1 = (Student) p1; // ok
		//Student s2 = (Student) p2; // runtime error! ClassCastException!
		/*
		 * Person����p1ʵ��ָ��Studentʵ����Person���ͱ���p2ʵ��ָ��Personʵ����������ת�͵�ʱ�򣬰�p1ת��ΪStudent��ɹ���
		 * ��Ϊp1ȷʵָ��Studentʵ����
		 * ��p2ת��ΪStudent��ʧ�ܣ���Ϊp2��ʵ��������Person�����ܰѸ����Ϊ���࣬��Ϊ���๦�ܱȸ���࣬��Ĺ����޷�ƾ�ձ������
			��ˣ�����ת�ͺܿ��ܻ�ʧ�ܡ�ʧ�ܵ�ʱ��Java������ᱨClassCastException��
		 */
		//Ϊ�˱�������ת�ͳ���
		
	}
}
