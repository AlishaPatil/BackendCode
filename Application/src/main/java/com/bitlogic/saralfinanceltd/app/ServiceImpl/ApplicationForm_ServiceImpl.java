package com.bitlogic.saralfinanceltd.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.saralfinanceltd.app.Model.AllPersonalDocs;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;
import com.bitlogic.saralfinanceltd.app.Model.EducationalInfo;
import com.bitlogic.saralfinanceltd.app.Repo.AccountDetails_Repository;
import com.bitlogic.saralfinanceltd.app.Repo.AllDoc_Repository;
import com.bitlogic.saralfinanceltd.app.Repo.ApplicationForm_Repository;
import com.bitlogic.saralfinanceltd.app.ServiceInterface.ApplicationForm_ServiceInterface;

@Service
public class ApplicationForm_ServiceImpl implements ApplicationForm_ServiceInterface {
	
	@Autowired
	ApplicationForm_Repository ar;
	@Autowired
	AllDoc_Repository docrepo;

	@Override
	public ApplicationForm addForm(ApplicationForm a) {

		 return ar.save(a);
	}

	@Override
	public List<ApplicationForm> getForm() {
		System.out.println("in service");
		return ar.findAll();
		
	}

	@Override
	public ApplicationForm updateForm(Integer customerId, ApplicationForm p) {
		// TODO Auto-generated method stub
		 Optional<ApplicationForm> op= ar.findById(customerId);
	        if(op.isPresent()) {
	        	 ApplicationForm form=op.get();
	        	form.setCustomerName(p.getCustomerName());
	        	form.setCustomerDateOfBirth(p.getCustomerDateOfBirth());
	        	form.setEducationalInfo(p.getEducationalInfo());
	        	form.setAccountDetails(p.getAccountDetails());
	        	form.setCurrentLoanDetails(p.getCurrentLoanDetails());
	        	form.setCustomerAddress(p.getCustomerAddress());
	        	form.setLoanDisbursement(p.getLoanDisbursement());
	        	form.setProfession(p.getProfession());
	        	form.setQuotation(p.getQuotation());
	        	
	        	form.setAllPersonalDocs(p.getAllPersonalDocs());
	        	return ar.save(form);
	        }
	       else {
			return null;
		}
	}

	@Override
	public AllPersonalDocs addDoc(AllPersonalDocs d) {
		// TODO Auto-generated method stub
		return docrepo.save(d);
	}

	
}
