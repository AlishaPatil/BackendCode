package com.bitlogic.saralfinanceltd.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlogic.saralfinanceltd.app.Model.AllPersonalDocs;
import com.bitlogic.saralfinanceltd.app.Model.ApplicationForm;

@Repository
public interface AllDoc_Repository extends JpaRepository<AllPersonalDocs, Integer>{

}
