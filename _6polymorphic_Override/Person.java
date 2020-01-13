package _6polymorphic_Override;

public class Person extends Object {
	protected String name;
	/*
	 * toString():��instance���ΪString
	 * equals():�ж�����instance�Ƿ��߼����
	 * hashCode():����һ��instance�Ĺ�ϣֵ
	 */
	@Override
	public String toString() {
		return "Person:name=" + name;
	}
	
	@Override
	public boolean equals(Object o) {
		//���ҽ���oΪPerson����
		if(o instanceof Person) {
			Person p = (Person) o;
			//and it is the same of two name, return true
			return this.name.equals(p.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	// super ��߸����� student ��д
	public String hello() {
		return "Hello, "+name;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
