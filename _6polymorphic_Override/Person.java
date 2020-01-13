package _6polymorphic_Override;

public class Person extends Object {
	protected String name;
	/*
	 * toString():把instance输出为String
	 * equals():判断两个instance是否逻辑相等
	 * hashCode():计算一个instance的哈希值
	 */
	@Override
	public String toString() {
		return "Person:name=" + name;
	}
	
	@Override
	public boolean equals(Object o) {
		//当且仅当o为Person类型
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
	
	// super 提高给子类 student 覆写
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
