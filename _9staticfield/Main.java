package _9staticfield;
// ��̬�ֶκ;�̬���� �ӿڵľ�̬�ֶ�
public class Main {
	public static void main(String[] args) {
		
		// 1 ��̬�ֶ�
		Person li = new Person("li", 14);
		Person zhang = new Person("zhang", 19);
		
		//�޸�li.number
		li.number = 10;
		System.out.println(li.number);
		//�鿴zhang.number
		System.out.println(zhang.number);//10
		//number Ϊ��̬�ֶ� ���ǲ�������ʵ�� ��Ȼʵ�����Է��ʾ�̬�ֶΣ���������ָ�����ʵ����Person class�ľ�̬�ֶΡ����ԣ�����ʵ������һ����̬�ֶΡ�
		
	    // ���Ƽ���ʵ��ȥ���ʾ�̬�ֶ� �Ƽ�������
		// �൱�ھ�̬ʵ����class�� ������ʵ����
		System.out.println(Person.number);
		
		// 2 ��̬����
		// ����ʵ����������ͨ��һ��ʵ�������������þ�̬��������Ҫʵ��������ͨ�������Ϳ��Ե��á���̬������������������Եĺ���
		Person.setNumber(99);
		System.out.println(Person.number);
	}
}
