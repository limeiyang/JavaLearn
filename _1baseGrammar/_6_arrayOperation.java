package _1baseGrammar;

import java.util.Arrays;

public class _6_arrayOperation {
	public static void main(String[] args) {
		//1 ��������
		//1.1 ��for��������
		int[] ns = {12, 23, 45, 56, 59};
		for(int i=0; i<ns.length; i++) {
			System.out.print(" "+ns[i]);
		}
		System.out.print("\n");
		//1.2 for each����
		for(int n : ns) {
			System.out.print(" "+ n);
		}
		System.out.print("\n");
		
		//2 ��ӡ��������
		//2.1 ֱ�Ӵ�ӡ
		System.out.print("ֱ�Ӵ�ӡ���飺"+ns);//�õ����� ns��JVM�е����õ�ַ
		//2.2 java��׼�����ṩ��Arrays.toString(),���Կ��ٴ�ӡ��������
		System.out.print("\n");
		System.out.print(Arrays.toString(ns));
		
		//3 ��������
		//3.1 �ó��õ��㷨 ð������ ��������� ��
		//3.2 java��׼���������������� Arrays.sort()
		int[] nt = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		Arrays.sort(nt);
		System.out.print(Arrays.toString(nt));
		System.out.print("\n");
		
		//4 ��ά����
		//4.1 ��ά���� -�������������
		 int[][] ns2 = {
		            { 1, 2, 3, 4 },
		            { 5, 6},//��ά�������������Ԫ�س��ȿ��Բ���ͬ
		            { 9, 10, 11, 12 }
		 };
		 System.out.println(ns2.length); // 3
		//���Զ���һ��һά���� ��ns2[0]��ֵ��
		 int[] arr0 = ns2[0];
		 System.out.print(Arrays.toString(ns2));//�������������ַ
		 System.out.print("\n");
		 System.out.print(Arrays.toString(arr0));
		 System.out.print("\n");
		 //4.2 ��ӡ��ά����
		 //����һ������forѭ��
		for(int[] arr : ns2) {
			for(int n : arr) {
				System.out.print(n);
				System.out.print(", ");
			}
			System.out.print("\n");
		}
		//��������ʹ��Java��׼���е�Arrays.deepToString()
		System.out.print(Arrays.deepToString(ns2));
		
		//5 �����в���
		//Java���������main��������main�������Խ���һ�������в���,����һ��String[]����
		//��������в�����JVM�����û����벢����main����
		for(String arg : args) {
			System.out.println("�����в���"+arg);//��ʱ�ǿյ�
		}
		//���ǿ������ý��յ��������в��������ݲ�ͬ�Ĳ���ִ�в�ͬ�Ĵ���
		//ʵ��һ��-version��������ӡ����汾��
		 for (String arg : args) {
	            if ("-version".equals(arg)) {
	                System.out.println("v 1.0");
	                break;
	            }
	        }
	}
}
