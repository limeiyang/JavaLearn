package _6polymorphic;

public class Student extends Person {
	// 1 . ��д��Override��
	// ����@Override�����ñ�������������Ƿ��������ȷ�ĸ�д��ϣ�����и�д�����ǲ�С��д���˷���ǩ�����������ᱨ��
	@Override
	public void run() {
		System.out.println("Student.run");
	}
}
