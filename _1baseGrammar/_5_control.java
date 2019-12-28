package _1baseGrammar;
import java.util.Scanner;

public class _5_control {
	public static void main(String[] agrs) {
		//1 ݔ���ݔ��
		System.out.println("��������� print line");
		System.out.print("���������");
		System.out.print("--������--");
		System.out.println("");
		
		//1.1 ��ʽ����� System.out.printf()
		double d = 3.1415926;
        System.out.printf("%.2f\n", d); // ��ʾ��λС��3.14
        System.out.printf("%.4f\n", d); // ��ʾ4λС��
		/*
		 *  %d	��ʽ���������
			%x	��ʽ�����ʮ����������
			%f	��ʽ�����������
			%e	��ʽ�������ѧ��������ʾ�ĸ�����
			%s	��ʽ���ַ���
		 */
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // ע�⣬����%ռλ�����봫��������
		
        //1.2 ����
        //��Ҫimport java.util.Scanner;
        Scanner scanner = new Scanner(System.in);//create Scanner object
        System.out.print("please input your name:");//print tips
        String names = scanner.nextLine();//read a line and get string
        System.out.print("please input your age:");//print tips
        int age = scanner.nextInt();//��ȡһ�в���ȡ����
        System.out.printf("Hi, %s, you are %d",names, age);
        /*
         *  ���ȣ�����ͨ��import��䵼��java.util.Scanner��import�ǵ���ĳ�������䣬����ŵ�JavaԴ����Ŀ�ͷ������������Java��package�л���ϸ�������ʹ��import��
			Ȼ�󣬴���Scanner���󲢴���System.in��System.out�����׼���������System.in�����׼��������ֱ��ʹ��System.in��ȡ�û�������Ȼ�ǿ��Եģ�����Ҫ�����ӵĴ��룬��ͨ��Scanner�Ϳ��Լ򻯺����Ĵ��롣
			����Scanner�����Ҫ��ȡ�û�������ַ�����ʹ��scanner.nextLine()��Ҫ��ȡ�û������������ʹ��scanner.nextInt()��Scanner���Զ�ת���������ͣ���˲����ֶ�ת����
         */
        
        //1.3 �ж����������Ƿ����
        /*
         * ��Java�У��ж�ֵ���͵ı����Ƿ���ȣ�����ʹ��==����������ǣ��ж��������͵ı����Ƿ���ȣ�
         * ==��ʾ�������Ƿ���ȡ�������˵���Ƿ�ָ��ͬһ���������磬���������String���ͣ����ǵ���������ͬ�ģ�
         * ���ǣ��ֱ�ָ��ͬ�Ķ�����==�жϣ����Ϊfalse
         */
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        //�ж����������Ƿ���� ������equals()����
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        // ע�⣺ִ�����s1.equals(s2)ʱ���������s1Ϊnull���ᱨNullPointerException��
        //������� 1��
        String s11 = null;
        if(s11 != null && s11.equals("hello")) {
        	System.out.println("hello");
        }
        //�������2��
        //�����԰�һ������null�Ķ���"hello"�ŵ�ǰ�棺���磺if ("hello".equals(s)) { ... }��
		
        //2 switch
        int option = 99;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
            System.out.println("Selected 2");
            break;
        case 3:
            System.out.println("Selected 3");
            break;
        default:
            System.out.println("Not selected");
            break;
        }
        //2.1 switch ���ʽ
        /*
         * ʹ��switchʱ�������©��break���ͻ�������ص��߼����󣬶��Ҳ�����Դ�����з��ִ���
         * ��Java 12��ʼ��switch�������Ϊ�����ı��ʽ�﷨��ʹ������ģʽƥ�䣨Pattern Matching���ķ�����
         * ��ֻ֤��һ��·���ᱻִ�У����Ҳ���Ҫbreak��䣺
         * 
         */
        /* java12 �ſ�����
        String fruit = "apple";
        switch (fruit) {
        case "apple" -> System.out.println("Selected apple");
        case "pear" -> System.out.println("Selected pear");
        case "mango" -> { //���������{}
            System.out.println("Selected mango");
            System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }
        
        //switch���ʽ�����Է���ֵ
         String fruit = "apple";
         int opt = switch (fruit) {
         	case "apple" -> 1;
         	case "pear", "mango" -> 2;
         	default -> 0;
        }; // ע�⸳ֵ���Ҫ��;����
        System.out.println("opt = " + opt);
        
        //switch yield 
         	//�����ʱ����switch���ʽ�ڲ������ǻ᷵�ؼ򵥵�ֵ��
			//���ǣ������Ҫ���ӵ���䣬����Ҳ����д�ܶ���䣬�ŵ�{...}�
			//Ȼ����yield����һ��ֵ��Ϊswitch���ķ���ֵ��
		String fruit = "orange";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch��䷵��ֵ
            }
        };
        System.out.println("opt = " + opt); 
         
        */
        
        //3 for each
        //����ͨ��forȥ��������
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            System.out.println(ns[i]);
        }
        // java �ṩ�˼򵥵ı�������ķ�ʽfor each(�ɱ������飬list��map��
        for (int n1 : ns) {
            System.out.println(n1);
        }
        
	}
}
