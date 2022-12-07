package com.bitlogic.saralfinanceltd.app.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bitlogic.saralfinanceltd.app.Model.AllPersonalDocs;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;
import com.bitlogic.saralfinanceltd.app.ServiceImpl.ApplicationForm_ServiceImpl;
import com.bitlogic.saralfinanceltd.app.ServiceInterface.ApplicationForm_ServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping("/ApiApplicationForm")
public class ApplicationFormController {
	
	@Autowired 
	ApplicationForm_ServiceInterface asi;
	//PostAPI
//	@PostMapping(value="/addForm")
//	public ResponseEntity<ApplicationForm> addEnquiry(@RequestBody ApplicationForm a)
//	{
//		ApplicationForm applicationForm=asi.addForm(a);
//		
//
//	    return new ResponseEntity<ApplicationForm>(applicationForm, HttpStatus.CREATED);
//	}
	
	
	@PostMapping(value="/addForm", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveApplication(@RequestPart ("addressProof") MultipartFile addressProof,
			@RequestPart ("panCard") MultipartFile panCard,
			@RequestPart ("IncomeTax") MultipartFile IncomeTax,
			@RequestPart ("addharCard") MultipartFile addharCard,
			@RequestPart ("photo") MultipartFile photo,
			@RequestPart ("signature") MultipartFile signature,
			@RequestPart ("UdyogAdhar") MultipartFile UdyogAdhar,
			@RequestPart("bankCheque") String bankCheque,
	        @RequestPart("salaryslip") String salaryslip,
            @RequestPart("bankStatement") String bankStatement,
            @RequestPart("ApplicationForm") String applicationForm)
	{
		ObjectMapper om = new ObjectMapper();
		ApplicationForm appForm;
		try {
			appForm=om.readValue(applicationForm,ApplicationForm.class);
			AllPersonalDocs d = new AllPersonalDocs();
			
			d.setAddressProof(addressProof.getBytes());
			d.setPanCard(panCard.getBytes());
			d.setIncomeTax(IncomeTax.getBytes());
			d.setAddharCard(addharCard.getBytes());
			d.setPhoto(photo.getBytes());
			d.setSignature(signature.getBytes());
			d.setUdyogAdhar(UdyogAdhar.getBytes());
			d.setBankCheque(bankCheque.getBytes());
			d.setSalaryslip(salaryslip.getBytes());
			d.setBankCheque(bankCheque.getBytes());
			appForm.setAllPersonalDocs(d);
			
		    asi.addForm(appForm);	
		    return "data save successfullyn !!!";
		

		} catch (Exception e) {
			e.printStackTrace();
		}
  return "save cust Form";
	}
	
	//GetAPI
			@GetMapping(value = "/getForm")
			public   ResponseEntity<List<ApplicationForm>> getForm(){
			System.out.println("in controller");
				List<ApplicationForm> list=asi.getForm();
				return new ResponseEntity<List<ApplicationForm>>(list,HttpStatus.OK);
				
	}
			
	//PutAPI
			@PutMapping(value = "/form/{customerId}",consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
			
			public  ResponseEntity<ApplicationForm> updateProduct(@PathVariable Integer customerId,@RequestBody ApplicationForm p) {
				ApplicationForm form=asi.updateForm(customerId,p);
				
				return new ResponseEntity<ApplicationForm>(form,HttpStatus.OK);
			}
			
			
}
