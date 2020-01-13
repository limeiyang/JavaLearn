package _6polymorphic;

public class Income {
	protected double income;
	
	public Income(double income) {
		this.income = income;
	}
	

	public double getTax() {
		return income * 0.1;//Ë°ÂÊ10%
	}
	
	
}

