package _2method;

public class Group {
	private String[] names;
	
	public String[] getNames() {
		return names;
	}
	


	//可变参数- 1 -直接定义
	public void setNames1(String... names) {
		this.names = names;
	}
	
	//可变参数 - 2 - 数组
	public void setNames2(String[] names) {
		this.names = names;
	}
	
}
