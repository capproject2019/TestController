package com.capgemini.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.AccountRequest;
import com.capgemini.model.AccountResponse;

@RestController
public class HomeController {

	@RequestMapping(value = "/getAccount", method = RequestMethod.POST)
	public ResponseEntity<?> GetAccountInformation(@RequestBody AccountRequest accountRequest) {
		return ResponseEntity.ok(new AccountResponse("successful!"));
	}
}
