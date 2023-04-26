package org.student;

public class AxisBank extends BankInfo {
	

	public void deposit(String accnum)
	{
		accnum="thu789";
		System.out.println("Deposit from Axis account"+accnum);
	}
	

	public static void main(String[] args) {
		
		AxisBank ax= new AxisBank();
		ax.deposit("tuyi8798");
		ax.deposit();

	}

}
