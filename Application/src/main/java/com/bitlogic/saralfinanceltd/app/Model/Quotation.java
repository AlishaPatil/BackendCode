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
public class Quotation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer quotationId;
	private String carmodel;
	private String carCompany;
	private String chassisNo;
	private String engineNo;
	private String color;
	private Double exShowroomPrice;
	private Double rtoRegistration;
	@OneToOne(cascade=CascadeType.ALL)
	private ShowroomDetails showroomDetails;
	

}
