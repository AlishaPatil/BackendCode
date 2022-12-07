package com.bitlogic.saralfinanceltd.app.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AllPersonalDocs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer documentID;
	
	@Lob
	private byte[] addressProof; 
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] IncomeTax;
	@Lob
	private byte[] addharCard;
	
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] UdyogAdhar;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] salaryslip;
	@Lob
	private byte[]  bankStatement;
	
}
