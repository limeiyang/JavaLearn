package _4methodOverloading;

public class Main {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello();//���õ�һ��
		h.hello("xiaoming");
		h.hello("xiaohua", 6);
	}
}
