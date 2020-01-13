package _6polymorphic;

//享受国务院特殊津贴，那么按照规定，可以全部免税
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
