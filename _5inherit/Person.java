package _5inherit;

public class Person {
	//private String name;
	//private int age;// ����Ҳ�޷�����
	protected String name;
	protected int age;//�������ֱ�ӷ���
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//�ղ����Ĺ��췽��
	public Person() {
		
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

