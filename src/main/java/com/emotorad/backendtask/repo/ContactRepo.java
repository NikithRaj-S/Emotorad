package com.emotorad.backendtask.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emotorad.backendtask.dto.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
	 Contact findByEmailOrPhoneNumber(String email, String phoneNumber);
}
