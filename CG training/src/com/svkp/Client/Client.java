package com.svkp.Client;

import com.svkp.bankAppilication.GSSavingAcc;
import com.svkp.bankAppilication.GsBankFactory;
import com.svkp.bankAppilication.GsCurrentAcc;

public class Client {
	
	public static void main(String[] args) {
		GsBankFactory gsbankfac= new GsBankFactory(0, null, 0, false);
		gsbankfac.getNewSavingAcc(0, null, 0, false);
		gsbankfac.getNewCurrentAcc(123, "suraj", 23456, true);
		
		GSSavingAcc gssaving = new GSSavingAcc(125,"krishna",123454,true);
		gssaving.withdrow(12344);
		
		GsCurrentAcc gscurrent = new GsCurrentAcc(234,"ram",56478,true);
		gscurrent.diposit(123);
	}
}