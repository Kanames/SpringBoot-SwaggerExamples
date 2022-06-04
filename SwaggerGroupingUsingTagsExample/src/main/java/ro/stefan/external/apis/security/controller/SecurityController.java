package ro.stefan.external.apis.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "security")
public class SecurityController {
	@GetMapping("/user")
	public String getUser() {
		return null;
	}

}
