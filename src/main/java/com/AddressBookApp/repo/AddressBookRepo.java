package com.AddressBookApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressBookRepo extends JpaRepository<AddressBookRepo	, Integer>{
	

}
