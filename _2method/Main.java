package _2method;

import java.util.Arrays;

public class Main {
	public static void main(String[] agrs) {
		//ʵ����Person
		Person li = new Person();
		li.setName("limeiyang");
		li.setAge(10);
		System.out.println(li.getName());
		
		//���������ĵ���-Person
		Person mei = new Person();
		mei.setNameAndAge("haohao", 15);
		System.out.println(mei.getName());
		
		//�ɱ���� 1 ֱ�Ӷ���--- Group
		Group g = new Group();
		g.setNames1("xiaoming", "xiaohong", "xiaojun");//����3��String
		g.setNames1("xiaoming");//����һ��string
		g.setNames1(); // ����0��String
		
		//�ɱ���� 2 �������� --Group
		Group p = new Group();
		p.setNames2(new String[] {"xiaoming", "xiaojun"});//��Ҫ�ȹ���String[]
		
		/*
		 *     ��һ�������ǣ����÷����Դ���null��
			Group g = new Group();
			g.setNames(null);
			���ɱ�������Ա�֤�޷�����null����Ϊ����0������ʱ�����յ���ʵ��ֵ��һ�������������null��
		 */
		
		//������
		// �����ǻ�������
		int a = 10;//Person
		li.setAge(a);
		System.out.println("������ ԭ����age = "+li.getAge());
		a = 15;
		System.out.println("������ �޸ĵ�a��age = "+li.getAge());//age����10 ��û�б�
		// ��������������
		String[] n = new String[] {"lili", "hahah", "dede"};
		g.setNames2(n);//Group
		System.out.println("������ ԭ����names = " + Arrays.toString(g.getNames()));
		n[0] = "�Ҹ���";//�޸�����n
		System.out.println("������ �޸���n ��ʱnames = " + Arrays.toString(g.getNames()));//��ʱnames�ı���
		//���ۣ��������Ͳ����Ĵ��ݣ����÷��ı������ͽ��շ��Ĳ���������ָ�����ͬһ������˫������һ�������������޸ģ�����Ӱ��Է�����Ϊָ��ͬһ���������
		// һ���ж�
		String na = "Bob";
		li.setName(na); //Person
		System.out.println("������ ԭ����name = "+li.getName());
		na = "limei";
		System.out.println("������ �޸�na�� name = "+li.getName());//����Bob
		
	}
}
