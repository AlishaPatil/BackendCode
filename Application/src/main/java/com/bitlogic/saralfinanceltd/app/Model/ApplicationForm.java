package com.bitlogic.saralfinanceltd.app.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplicationForm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	private String customerName;
	private String customerDateOfBirth;
    private Integer customerAge;
	private String customerGender;
	private String customerEmail;
	private long customerMobileNumber;
	private long customerAdditionalMobileNumber;
	private Double customerAmountPaidForCar;
	private Double customerTotalLoanRequired;
	@OneToOne(cascade=CascadeType.ALL)
	private EducationalInfo educationalInfo;
	@OneToOne(cascade=CascadeType.ALL)
	private AllPersonalDocs allPersonalDocs;
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerAddress customerAddress;
	@OneToOne(cascade=CascadeType.ALL)
	private Profession profession;
	@OneToOne(cascade=CascadeType.ALL)
	private CurrentLoanDetails currentLoanDetails;
	@OneToOne(cascade=CascadeType.ALL)
	private AccountDetails accountDetails;
	@OneToOne(cascade=CascadeType.ALL)
	private Quotation quotation;
	@OneToOne(cascade=CascadeType.ALL)
	private LoanDisbursement loanDisbursement;

}
