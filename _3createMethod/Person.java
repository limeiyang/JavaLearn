package _3createMethod;

public class Person {
	private String name; //ϵͳ��ʼֵΪnull
	private int age = 30; //ϵͳ��ʼֵΪ0������ֱ�ӳ�ʼ��
	
	
	//���췽�� -- ��������壬���Զ�����
	public Person() {
		//��������
	}
	
	//���췽��--������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//���췽�� -- �����ֲ��� --���õ�ʱ����ݲ�������Ŀ���͵���
	public Person(String name) {
		this.name = name;
	}
	
	//һ�����췽�����Ե��������Ĺ��췽��
	//���÷��� this(...)
	public Person(int age) {
		this("Unnamed");//����Person(String name)
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
