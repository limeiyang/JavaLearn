package _10package;

// ���� _8interface.Student
import _8interface.Student;

// ���� _9staticfield���������class ���������� �� *
import _9staticfield.*;

// import static ���뾲̬�ֶκͷ���
import static java.lang.System.*;
// ����System������о�̬�ֶκ;�̬����:
// �൱�ڵ���System.out.println(��)
// out.println("Hello, world!");

//1 ��  �����Լ��� ��
// ��Java������У�JVMֻ��������������ˣ�ֻҪ������ͬ����Ͳ�ͬ��
// �������Ƕ��ṹ����.���������磺java.util
// ��û�и��ӹ�ϵ��java.util��java.util.zip�ǲ�ͬ�İ�������û���κμ̳й�ϵ��
// û�ж��������class����ʹ�õ���Ĭ�ϰ����ǳ������������ֳ�ͻ����ˣ����Ƽ���д������������

//2 ��������
// ͬһ�����еķ�����class����ֱ���ڸ���class��ʹ��

public class Main {
	//3 import
	// ��һ��class�� ����Ҫ����������class
	// ���� _10package.Main (���������) ��Ҫ���� _8interface.Student
	// 3.1 ֱ��д���������� ��Ϊ����
	public void run() {
		_8interface.Student s = new _8interface.Student("ddd");
	}
	// 3.2 import ��� �����_8interface.Student Ȼ��ֱ��д�򵥵�����
	public void run1() {
		Student s = new Student("ddd1");
	}
}

// 4 Java�����������.class˳��
/*
 * �ڴ����У�������������һ��class����ʱ��
 * 
 * �����������������ֱ�Ӹ������������������class��

   ����Ǽ��������������˳�����β��ң�

   ���ҵ�ǰpackage�Ƿ�������class��

   ����import�İ��Ƿ�������class��

   ����java.lang���Ƿ�������class��

   �����������Ĺ����޷�ȷ������������뱨��
 */
