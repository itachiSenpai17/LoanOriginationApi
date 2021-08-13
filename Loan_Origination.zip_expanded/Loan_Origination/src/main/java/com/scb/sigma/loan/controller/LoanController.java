package com.scb.sigma.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.scb.sigma.loan.entities.Loan;
import com.scb.sigma.loan.service.ILoanService;
import com.scb.sigma.loan.utils.Status;


@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {
	
	@Autowired
	ILoanService loanService;
	
	@PostMapping("/loan")
	public ResponseEntity addLoan(@RequestBody Loan l) {
		
		ResponseEntity response=null;
		
		String result=loanService.addLoan(l);
		
		if(result.equals(Status.SUCCESS))
		{
			response=new ResponseEntity<>(HttpStatus.CREATED);
		}
		else
		{
			response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return response;
	}
	
	@PutMapping("/loan/{transaction_id}")
	public ResponseEntity<Object> updateLoan(@RequestBody Loan l,@PathVariable long transaction_id)
	{
		ResponseEntity<Object> response=null;
		String result=loanService.updateLoan(l, transaction_id);
		if(result.equals(Status.SUCCESS))
		{
			response=new ResponseEntity<>(HttpStatus.OK);
		}
		else
		{
			response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;	
	}
	
	@GetMapping("/myloan/{transaction_id}")
	public ResponseEntity<Loan> getLoanById(@PathVariable long transaction_id)
	{
		ResponseEntity<Loan> response=null;
		
		Loan l=loanService.getLoanById(transaction_id);
		
		if(l!=null)
		{
			response=new ResponseEntity<>(l,HttpStatus.OK);
		}
		else
		{
			response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
