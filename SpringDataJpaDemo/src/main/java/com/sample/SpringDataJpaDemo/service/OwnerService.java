package com.sample.SpringDataJpaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.SpringDataJpaDemo.repository.OwnerRepository;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository repo;
	
	
}
