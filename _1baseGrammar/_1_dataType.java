package _1baseGrammar;

/**
 * ���������Զ������ĵ���ע��
 * @author ��limeiyang
 *
 */
public class _1_dataType {
	public static void main(String[] args) {
		
		//1.��һ������ hello world
		System.out.println("hello world");
		
		//2.����
		//2.1�������͵ı���
		/*
		�������ͣ�byte(1�ֽ�) short��2�ֽڣ� int��4�ֽڣ� long��8�ֽڣ�
		���������ͣ�float��4�ֽڣ� double��8�ֽڣ�
		�ַ����ͣ�char��2�ֽڣ�
		�������ͣ�boolean (������1 bit������JVM��ʾΪ4�ֽ�����)
		*/
		int n = 100;
		System.out.println("n = " + n);
		//���ͱ����ĸ��ֶ���
		int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // ���»��߸�����ʶ��
        int i4 = 0xff0000; // ʮ������0x��ʾ��16711680
        int i5 = 0b1000000000; // ������0b��ʾ��512
        long l = 9000000000000000000L; // long�͵Ľ�β��Ҫ��L
        System.out.println("���������i="+i+"  i3="+i3+"  i4="+i4);
        //�����͵ĸ��ֶ���
        float f1 = 3.14f;// �����ͽ�βҪ��f
        float f2 = 3.14e38f; // ��ѧ��������ʾ��3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // ��ѧ��������ʾ��4.9x10^-324
        System.out.println("�����������f2="+f2);
        //��������
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; //������Ϊtrue
        int age = 12;
        boolean isAdult = age >= 18; //������Ϊfalse
        System.out.println("boolean���������:isGreater="+isGreater);
		//�ַ�����
        char a = 'A'; //�ɱ�ʾ��׼��ASCII...ע�ⵥ����
        char zh = '��'; //Ҳ���Ա�ʾһ�� Unicode �ַ�
        System.out.println("�ַ�������� a = "+a+"  zh = "+zh);
        
        // ����
        final double PI = 3.14; //�ڶ����֮ǰ����final ���ǳ�����
        double r = 5.0;
        double area = PI * r * r;//�������ܱ����¸�ֵ���ᵼ�±������
        System.out.println("������� area = "+ area);
        
        // var �ؼ���
        /* ��Ҫ����ʡ���������ֹ����Ķ���
         * �� StringBuilder sb = new StringBuilder();
         * ���� var sb = new StringBuilder();
         * ���������Զ����ƶ�sb��������StringBuilder
         */
	}
}
