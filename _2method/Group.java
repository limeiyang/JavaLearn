package _2method;

public class Group {
	private String[] names;
	
	public String[] getNames() {
		return names;
	}
	


	//�ɱ����- 1 -ֱ�Ӷ���
	public void setNames1(String... names) {
		this.names = names;
	}
	
	//�ɱ���� - 2 - ����
	public void setNames2(String[] names) {
		this.names = names;
	}
	
}
