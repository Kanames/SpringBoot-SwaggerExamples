package ro.stefan.external.apis.accounting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountingController {
	
	@GetMapping("/accounts")
	public List<String> getAccounts(){
		return null;
	}
}
