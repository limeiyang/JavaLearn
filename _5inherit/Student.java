package _5inherit;

//Java ֻ����һ��class�̳�һ���࣬һ�������ҽ���һ������
public class Student extends Person{
	/**
	 *  �̳�Person
	 *name; age 
	 */
	private int score;
	
	
	public String hello() {
		return "hello " + super.name;
		//�����super.name ���Ǳ�ʾ ���ࣨ���ࣩ��name;
				//������Ե�ͬ��this.name ���� name;
				// ������ʱ�����super ���£�
	}
	
	//�����super
	/*
	 * public Student(String name, int age, int score) {
        	this.score = score;
    	}
    	��ʱ�ᱨ�� -- ��ΪϵͳĬ�ϻ��������е��ø���Ĺ��췽��
    	
    	public Student(String name, int age, int score) {
        	super(); // �Զ����ø���Ĺ��췽��
        	this.score = score;
    	}
    	���Ǵ�ʱPerson�в�û���޲����Ĺ��췽��-�ʱ���
	 * 
	 */
	public Student(String name, int age, int score) {
		super(name, age);//�������ø���Ĺ��췽��Person(String name, int age)
		this.score = score;	
	}
	
	//�ղ����ĵ��ú���
	public Student() {
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
