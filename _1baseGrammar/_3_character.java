package _1baseGrammar;

public class _3_character {
	public static void main(String[] args) {
		//1 �ַ�����char
		// һ��char����һ��Unicode�ַ�
		char c1 = 'A';
		char c2 = '��';
		//��ΪJava���ڴ�������ʹ��Unicode��ʾ�ַ������ԣ�һ��Ӣ���ַ���һ�������ַ�����һ��char���ͱ�ʾ��
		//���Ƕ�ռ�������ֽڡ�Ҫ��ʾһ���ַ���Unicode���룬ֻ�轫char����ֱ�Ӹ�ֵ��int���ͼ��ɣ�
		int n1 = 'A';//A��Unicode������65
		int n2 = '��';//�е�Unicode�ı�����20013
		// ��������ת���ַ� \ u+Unicode����(ʮ������)����ʾһ���ַ�
		char c3 = '\u0041'; // 'A'����Ϊʮ������0041 = ʮ����65
		char c4 = '\u4e2d'; // '��'����Ϊʮ������4e2d = ʮ����20013
		System.out.println("�ַ���� c3="+c3+"  c4="+c4);
		
		//2 �ַ�������
		//��char���Ͳ�ͬ���ַ�������String���������ͣ�������˫����"..."��ʾ�ַ�����һ���ַ������Դ洢0����������ַ�
		String s = "";//���ַ���������0���ַ�
		String s1 = "A";//����һ���ַ�
		String s2 = "���� ABC";//���������ַ�������һ���ǿո�
		// ��ת���ַ� \ 
		String s3 = "abc\"xyz"; // ����7���ַ�: a, b, c, ", x, y, z
		String s4 = "abc\\xyz"; // ����7���ַ�: a, b, c, \, x, y, z
		/*
		 * 	\" ��ʾ�ַ�"
			\' ��ʾ�ַ�'
			\\ ��ʾ�ַ�\
			\n ��ʾ���з�
			\r ��ʾ�س���
			\t ��ʾTab
			\ u#### ��ʾһ��Unicode������ַ� 
		 */
		String s5 = "ABC\n\u4e2d\u6587"; // ����6���ַ�: A, B, C, ���з�, ��, ��
		//2.1 ������+���������ַ������������͵�����
		String s6 = s1 + s2 + "!!!";
		System.out.println("�ַ������ s6="+s6);
		//�����+���������������ͣ������Զ�ת��Ϊ�ַ�����������
		int age = 25;
		String s7 = "age is "+age;
		System.out.println("���������s7="+s7);
		//2.2 �����ַ���
		//���Ҫ��ʾ�����ַ�������+�ܲ�����
		// ������""" ... """(Java13����)
		String q1 = "first line \n"
				+ "second line \n"
				+ "end";
		/*
		String q2 = """
                SELECT * FROM
                users
              WHERE id > 100
              ORDER BY name DESC
              """;
              */
		System.out.println("�����ַ������q1="+q1);
		
		//2.3 ���ɱ�����
		//Java���ַ���������һ�����������⣬���и���Ҫ�ص㣬�����ַ������ɱ䡣
		String s11 = "hello";
        System.out.println(s11); // ��ʾ hello
        s11 = "world";
        System.out.println(s11); // ��ʾ world
        //�۲�ִ�н�����ѵ��ַ���s��������ʵ��Ĳ����ַ��������Ǳ���s�ġ�ָ�򡱡�
        //ִ��String s = "hello";ʱ��JVM������ȴ����ַ���"hello"��Ȼ�󣬰��ַ�������sָ����
		//�����ţ�ִ��s = "world";ʱ��JVM������ȴ����ַ���"world"��Ȼ�󣬰��ַ�������sָ����
        //ԭ�����ַ���"hello"���ڣ�ֻ�������޷�ͨ������s���������ѡ���ˣ��ַ����Ĳ��ɱ���ָ�ַ������ݲ��ɱ�
        String u = "hello";
        String t = u;
        u = "world";
        System.out.println(t); // t��"hello"����"world"? ��hello
        
        //2.4 ��ֵnull
        // �������͵ı�������ָ��һ����ֵnull������ʾ�����ڣ����ñ�����ָ���κζ���
        String s111 = null; // s111��null
        String s21; // û�и���ֵֵ��s21Ҳ��null
        String s31 = s111; // s31Ҳ��null
        String s41 = ""; // s41ָ����ַ���������null
        //ע��Ҫ���ֿ�ֵnull�Ϳ��ַ���""�����ַ�����һ����Ч���ַ���������������null��
        
        
	}
}
