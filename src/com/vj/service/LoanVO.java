package com.vj.service;

public class LoanVO {
	
	int loanId;

	double loanAmount;
	
	double interestRate;
	
	int termInMonths;
	
	double monthlyPayment;
	
	public LoanVO(int loanId, double loanAmount, int termInMonths,double interestRate) {
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.termInMonths = termInMonths;
		this.interestRate = interestRate;
	}
	
	

	/**
	 * @return the loanId
	 */
	public int getLoanId() {
		return loanId;
	}



	/**
	 * @param loanId the loanId to set
	 */
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}



	/**
	 * @return the loanAmount
	 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the termInMonths
	 */
	public int getTermInMonths() {
		return termInMonths;
	}

	/**
	 * @param termInMonths the termInMonths to set
	 */
	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	/**
	 * @return the monthlyPayment
	 */
	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	/**
	 * @param monthlyPayment the monthlyPayment to set
	 */
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	public String printMonthlyPayment() {
		StringBuffer sb = new StringBuffer();
		sb.append("Monthly Payment for loan "+getLoanId());
		sb.append(" with [");
		sb.append(getLoanAmount());
		sb.append(" Loan Amount ");
		sb.append(getTermInMonths());
		sb.append(" Months Term ");
		sb.append(getInterestRate());
		sb.append(" InterestRate ");
		sb.append("] is : ");
		sb.append(getMonthlyPayment());
		
		return sb.toString();
	}

}
