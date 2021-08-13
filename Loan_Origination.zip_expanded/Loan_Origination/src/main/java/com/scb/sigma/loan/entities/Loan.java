package com.scb.sigma.loan.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanDatabase")

public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long transaction_id;
	
	@Column(name= "FIRSTNAME")
	
	String firstname;
	@Column(name= "LASTNAME")
	String lastname;
	@Column(name= "DOB")
	LocalDate dob;
	@Column(name= "GENDER")
	String gender;
	@Column(name= "MARITAL")
	String marital_status;
	@Column(name= "EMAIL")
	String email;
	@Column(name= "PHONE")
	
	Long phone;
	@Column(name= "ADDRESS")
	String address;
	@Column(name= "LOAN_TYPE")
	String loan_type;
	@Column(name= "LOAN_AMOUNT")
	Long loan_amount;
	@Column(name= "LOAN_PERIOD")
	int loan_period;
	
	@Column(name= "SALARY")
	Long annual_salary;
	@Column(name= "AADHAR")
	Long aadhar_number;
	@Column(name= "PAN")
	String pan_number;
	@Column(name= "PASSPORT")
	String passport_number;
	@Column(name= "GUARANTOR_NAME")
	String guarantor_name;
	@Column(name= "GUARANTOR_ADDRESS")
	String guarantor_address;
	@Column(name= "GUARANTOR_PHONE")
	Long guarantor_phone;
	@Column(name= "UNIQUE_ID")
	String unique_id;
	@Column(name= "STATUS")
	String status;
	@Column(name= "COMMENT")
	String comment;
	@Column(name= "ENTRYDATE")
	LocalDate entrydate;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(Long transaction_id, String firstname, String lastname, LocalDate dob, String gender,
			String marital_status, String email, Long phone, String address, String loan_type, Long loan_amount,
			int loan_period, Long annual_salary, Long aadhar_number, String pan_number, String passport_number,
			String guarantor_name, String guarantor_address, Long guarantor_phone, String unique_id, String status,
			String comment, LocalDate entrydate) {
		super();
		this.transaction_id = transaction_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.marital_status = marital_status;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
		this.loan_period = loan_period;
		this.annual_salary = annual_salary;
		this.aadhar_number = aadhar_number;
		this.pan_number = pan_number;
		this.passport_number = passport_number;
		this.guarantor_name = guarantor_name;
		this.guarantor_address = guarantor_address;
		this.guarantor_phone = guarantor_phone;
		this.unique_id = unique_id;
		this.status = status;
		this.comment = comment;
		this.entrydate = entrydate;
	}

	public Loan(String firstname, String lastname, LocalDate dob, String gender, String marital_status, String email,
			Long phone, String address, String loan_type, Long loan_amount, int loan_period, Long annual_salary,
			Long aadhar_number, String pan_number, String passport_number, String guarantor_name,
			String guarantor_address, Long guarantor_phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.marital_status = marital_status;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
		this.loan_period = loan_period;
		this.annual_salary = annual_salary;
		this.aadhar_number = aadhar_number;
		this.pan_number = pan_number;
		this.passport_number = passport_number;
		this.guarantor_name = guarantor_name;
		this.guarantor_address = guarantor_address;
		this.guarantor_phone = guarantor_phone;
	}

	public Long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public Long getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(Long loan_amount) {
		this.loan_amount = loan_amount;
	}

	public int getLoan_period() {
		return loan_period;
	}

	public void setLoan_period(int loan_period) {
		this.loan_period = loan_period;
	}

	public Long getAnnual_salary() {
		return annual_salary;
	}

	public void setAnnual_salary(Long annual_salary) {
		this.annual_salary = annual_salary;
	}

	public Long getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(Long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public String getGuarantor_name() {
		return guarantor_name;
	}

	public void setGuarantor_name(String guarantor_name) {
		this.guarantor_name = guarantor_name;
	}

	public String getGuarantor_address() {
		return guarantor_address;
	}

	public void setGuarantor_address(String guarantor_address) {
		this.guarantor_address = guarantor_address;
	}

	public long getGuarantor_phone() {
		return guarantor_phone;
	}

	public void setGuarantor_phone(Long guarantor_phone) {
		this.guarantor_phone = guarantor_phone;
	}

	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(LocalDate entrydate) {
		this.entrydate = entrydate;
	}

	@Override
	public String toString() {
		return "Loan [transaction_id=" + transaction_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dob=" + dob + ", gender=" + gender + ", marital_status=" + marital_status + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", loan_type=" + loan_type + ", loan_amount="
				+ loan_amount + ", loan_period=" + loan_period + ", annual_salary=" + annual_salary + ", aadhar_number="
				+ aadhar_number + ", pan_number=" + pan_number + ", passport_number=" + passport_number
				+ ", guarantor_name=" + guarantor_name + ", guarantor_address=" + guarantor_address
				+ ", guarantor_phone=" + guarantor_phone + ", unique_id=" + unique_id + ", status=" + status
				+ ", comment=" + comment + ", entrydate=" + entrydate + "]";
	}
	
	
	
	
}
