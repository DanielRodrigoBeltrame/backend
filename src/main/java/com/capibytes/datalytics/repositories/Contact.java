package com.capibytes.datalytics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact extends JpaRepository <Contact, Long>{
}