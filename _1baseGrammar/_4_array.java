package _1baseGrammar;

public class _4_array {
	public static void main(String[] args) {
		//1 �������ʾһ��int����
		int[] ns = new int[5];
		 ns[0] = 68;
	     ns[1] = 79;
	     ns[2] = 91;
	     ns[3] = 85;
	     ns[4] = 62;
	     /*
	      * ��������Ԫ�س�ʼ��ΪĬ��ֵ�����Ͷ���0����������0.0����������false��
			����һ�������󣬴�С�Ͳ��ɸı䡣
			�������������ͣ���ʹ��������������Ԫ��ʱ���������������Χ������ʱ������
	      */
	     //��.length ��ȡ����Ĵ�С
	     System.out.println("�����СΪ��ns.length="+ns.length);
	     //Ҳ���ڶ�������ʱֱ��ָ����ʼ����Ԫ�أ������Ͳ���д������Ĵ�С���ɱ������Զ�����
	     int[] nt = new int[] {68, 34,34,55,3};
	     System.out.println("���鳤��nt.length="+nt.length);
	     
	     //1.1  ��С���ɱ�
	     int[] ns1;
	     ns1 = new int[] { 68, 79, 91, 85, 62 };
	     System.out.println(ns1.length); // 5
	     ns1 = new int[] { 1, 2, 3 };
	     System.out.println(ns1.length); // 3
	     //�������������ͣ����������С���ɱ�
	     // ʵ��ֻ��ns1ָ�������ı� ��СΪ5�����黹���ڴ��У�û�иı䣬ֻ�ǲ�����ns1ȥ������
	     
	     //2 �ַ�������
	     String[] names = {
	    		 "ABC","xyz","zoo"
	     };
	     //����names ����������Ԫ�� ÿ��Ԫ�طֱ���һ���ַ������͵�����
	     //�����������������͵ģ���˶�names[0]�������¸�ֵ����names[0]="cat";
	     //ֻ�ǽ�names[0]ָ��ĵ�cat����ABC������ԭ����λ�á�
	     String[] names1 = {"ABC", "XYZ", "zoo"};
	        String s = names1[1];
	        names1[1] = "cat";
	        System.out.println(s); // s��"XYZ"����"cat"? ��XYZ
	     
	     
	     
	     
	}
}
