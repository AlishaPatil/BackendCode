package com.bitlogic.saralfinanceltd.app.ServiceInterface;

import java.util.List;

import com.bitlogic.saralfinanceltd.app.Model.AllPersonalDocs;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;

public interface ApplicationForm_ServiceInterface {

	public ApplicationForm addForm(ApplicationForm a);

	public List<ApplicationForm> getForm();

	public ApplicationForm updateForm(Integer customerId, ApplicationForm p);

	public AllPersonalDocs addDoc(AllPersonalDocs d);

}
