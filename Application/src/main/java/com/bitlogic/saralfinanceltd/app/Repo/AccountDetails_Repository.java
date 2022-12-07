package com.bitlogic.saralfinanceltd.app.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bitlogic.saralfinanceltd.app.Model.AccountDetails;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;

@Repository
public interface AccountDetails_Repository extends CrudRepository<AccountDetails, Integer>{

}
