/*
 * TransactionRestController.java
 *
 * Copyright (c) 2016 Manulife International Ltd.
 *
 * Description:
 * 
 *
 * Maintenance History
 * 
 * YYMMDD Who              Reason
 * ====== ================ ====================================================
 * 170808 Cognizant       Application Development
 */
package com.manulife.hk;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manulife.hk.service.SampleService;

@Controller
public class SampleController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

	@Autowired
	private SampleService sampleService;

	//@RequestMapping("/web")
	@GetMapping("/web")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		System.out.println("haiiiiiiiiiiiii");
		String groupNumber = sampleService.getValue();
		System.out.println(groupNumber);
		return "home";
	}

}
