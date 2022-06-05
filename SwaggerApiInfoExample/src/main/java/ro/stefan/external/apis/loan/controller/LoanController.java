package ro.stefan.external.apis.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "loan")
public class LoanController {
	
	@GetMapping("/loan")
	public String getLoanDetails() {
		return null;
	}
}
