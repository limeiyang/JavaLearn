package _8interface;

//�ڳ������У����󷽷��������Ƕ���ӿڹ淶�����涨�߲���Ľӿڣ��Ӷ���֤�������඼����ͬ�Ľӿ�ʵ�֣���������̬���ܷ��ӳ�������
//���һ��������û���ֶΣ����з���ȫ�����ǳ��󷽷�
//�Ϳ��԰Ѹó������дΪ�ӿڣ�interface
interface Person {
	void run();
	String getName();
	//default����
	default void rundefault() {
		System.out.println(getName()+"run");
	}
}
//��νinterface�����Ǳȳ����໹Ҫ����Ĵ�����ӿڣ���Ϊ�����ֶζ������С���Ϊ�ӿڶ�������з���Ĭ�϶���public abstract�ģ��������������η�����Ҫд������д��дЧ����һ������