package com.scb.sigma.loan.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.scb.sigma.loan.entities.Loan;
import com.scb.sigma.loan.repository.ILoanRepository;
import com.scb.sigma.loan.service.ILoanService;
import com.scb.sigma.loan.utils.Status;



@Service
public class LoanServiceImpl implements ILoanService{

	@Autowired
	ILoanRepository loanRepo;
	
	@Override
	public String addLoan(Loan l) {
		String status="";
		try
		{
			Loan returnedLoan=null;
			returnedLoan = loanRepo.save(l);
			if(returnedLoan!=null)
			{
				status=Status.SUCCESS;
			}
			else
			{
				status=Status.NOT_FOUND;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String updateLoan(Loan l, long transaction_id) {
		String status="";
		try
		{
			Optional<Loan> returnedLoan=null;
			returnedLoan = loanRepo.findById(transaction_id);
			if(returnedLoan.isPresent())
			{
				loanRepo.save(l);
				status=Status.SUCCESS;
			}
			else
			{
				status=Status.NOT_FOUND;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Loan getLoanById(long transaction_id) {
		Optional<Loan> l=null;
		try {
			l= loanRepo.findById(transaction_id);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(l.isPresent()) {
		return l.get();}
		else {
			return null;
		}
	}
	
}
