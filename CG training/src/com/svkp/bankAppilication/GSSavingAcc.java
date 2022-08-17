package com.svkp.bankAppilication;

import com.svkp.FrameWork.SavingAcc;

public class GSSavingAcc extends SavingAcc {
	private static final float accountbalance = 0;
	private String accno;


	public GSSavingAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	public void withdrow(float accBal) {
			System.out.println("Dear custamer,your Accoutbal"+ accountbalance);
		}
	    public void deposit(float accBal) {
	    	System.out.println("dear custamer,your acccoutbal"+ accountbalance);
	    }

		@Override
		public String toString() {
			String diposit = null;
			return "GsSavingAcc [accno=" + accno + ", diposit=" + diposit + ", accountbalance=" + accountbalance + "]";
		}
		
}