package ro.stefan.external.apis.address.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@GetMapping("/addresses")
	public List<String> getAddresses(){
		return null;
	}
}
