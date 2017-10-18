package com.manulife.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manulife.hk.domain.TransactionEntity;
import com.manulife.hk.repository.TransactionRepository;

/**
 * @author Cognizant
 *
 *         TransactionServiceImpl
 */
@Service
public class SampleService {

@Autowired
TransactionRepository transactionRepository;
	
public String getValue(){
	String data=transactionRepository.findOneByRefNo();
	System.out.println("haiiiiiiiii44444444444444444444444i : "+data);
	return "hello";
}
}
