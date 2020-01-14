package _9staticfield;

public interface Student {
	//因为interface是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为final类型：
	public static final int MALE = 1;
    public static final int FEMALE = 2;
    //实际上 上面的可以简写：
    int MALE1 = 1;
    int FEMALE1 = 2;
    //编译器会自动加上public statc final:
}
