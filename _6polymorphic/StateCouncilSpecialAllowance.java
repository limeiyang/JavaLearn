package _6polymorphic;

//���ܹ���Ժ�����������ô���չ涨������ȫ����˰
public class StateCouncilSpecialAllowance extends Income{
	public StateCouncilSpecialAllowance(double income) {
		super(income);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTax() {
		return 0;
	}
}
