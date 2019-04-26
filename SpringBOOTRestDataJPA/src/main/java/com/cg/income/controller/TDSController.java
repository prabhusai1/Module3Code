package com.cg.income.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.income.model.TDSMaster;
import com.cg.income.service.TDSService;

@RestController
public class TDSController {

	@Autowired
	TDSService tdsMasterService;

	@GetMapping("/")
	public String sayHi() {
		return "welcome";
	}

	@GetMapping("/getById")
	public ResponseEntity getByPid(@RequestBody int pId) {
		TDSMaster tdsMaster1 = tdsMasterService.getByPid(pId);
		if (tdsMaster1 == null) {
			throw new UserNotFoundException("user not found " + pId);
		} else
			return new ResponseEntity(tdsMaster1, HttpStatus.OK);
	}

}
