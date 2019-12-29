package _4methodOverloading;

public class Main {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello();//调用第一个
		h.hello("xiaoming");
		h.hello("xiaohua", 6);
	}
}
