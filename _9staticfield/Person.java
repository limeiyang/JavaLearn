package _9staticfield;

public class Person {
	private String name;
	private int age;
	
	//��̬�ֶ�
	public static int number;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//��̬����
	public static void setNumber(int value) {
		number = value;
		//������this ��Ϊ��̬���������� ����������ʵ��
	}
}
