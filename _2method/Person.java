package _2method;


public class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			//���ֿ����׳�����
			throw new IllegalArgumentException("invalid name");
		}else {
			this.name = name;
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//��������(��������)
	public void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}


