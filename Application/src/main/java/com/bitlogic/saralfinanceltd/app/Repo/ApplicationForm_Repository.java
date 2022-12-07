package com.bitlogic.saralfinanceltd.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;

@Repository
public interface ApplicationForm_Repository extends JpaRepository<ApplicationForm, Integer>{

}
