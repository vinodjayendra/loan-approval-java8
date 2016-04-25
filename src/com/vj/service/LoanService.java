package com.vj.service;

import java.util.ArrayList;
import java.util.List;

public class LoanService {
	
	public static void calcMonthlyMortgaePayment(List<LoanVO> loans) {
		loans.forEach(loan -> {
		double monthlyRate = loan.interestRate / 1200;
		double monthlyPayment = loan.getLoanAmount() * monthlyRate /  (1-Math.pow(1+monthlyRate, -loan.getTermInMonths()));
		loan.setMonthlyPayment(Math.round(monthlyPayment));
		System.out.println(loan.printMonthlyPayment());
		});
	}

	public static void main(String[] args) {
		List<LoanVO> loans = new ArrayList<LoanVO>();
		LoanVO loan = new LoanVO(1,300000,240,3);
		LoanVO loan1 = new LoanVO(2,500000,240,3);
		
		loans.add(loan);
		loans.add(loan1);
		
		calcMonthlyMortgaePayment(loans);
	}

}
