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
public class ShowroomDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ShowroomId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private Long pincode;
	private String streetName;
	

}
