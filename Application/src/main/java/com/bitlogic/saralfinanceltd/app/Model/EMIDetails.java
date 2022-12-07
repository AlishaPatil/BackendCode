package com.bitlogic.saralfinanceltd.app.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emiID;
	private Double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;
	

}
