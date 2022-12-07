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
public class CurrentLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer currentloanId;
	private Integer currentloanNo;
	@OneToOne(cascade=CascadeType.ALL)
	private EMIDetails emidetails;
	private Double loanAmount;
	private Double rateOfInterest;
	private Integer tenure;
	private Double totalAmounttobepaid;
	private Integer processingFees;
	private Double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;

}
