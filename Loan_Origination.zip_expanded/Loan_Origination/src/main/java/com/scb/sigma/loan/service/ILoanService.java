package com.scb.sigma.loan.service;


import com.scb.sigma.loan.entities.Loan;

public interface ILoanService  {
	public String addLoan(Loan l);
	public String updateLoan(Loan l,long transaction_id);
	public Loan getLoanById(long transaction_id);
}
