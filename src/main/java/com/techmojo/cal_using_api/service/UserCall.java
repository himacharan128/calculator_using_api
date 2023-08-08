package com.techmojo.cal_using_api.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techmojo.cal_using_api.pojo.CalculatorRequest;

@RestController
public class UserCall {
	
	@PostMapping(value="/calc/add")
	public double add(@RequestBody CalculatorRequest request) {
		return request.getNumber1() + request.getNumber2();
	}
	@PostMapping(value="/calc/sub")
	public double sub(@RequestBody CalculatorRequest request) {
		return request.getNumber1() - request.getNumber2();
	}
	@PostMapping(value="/calc/mul")
	public double mul(@RequestBody CalculatorRequest request) {
		return request.getNumber1() * request.getNumber2();
	}
	@PostMapping(value="/calc/div")
	public double div(@RequestBody CalculatorRequest request) {
		return request.getNumber1() / request.getNumber2();
	}
}