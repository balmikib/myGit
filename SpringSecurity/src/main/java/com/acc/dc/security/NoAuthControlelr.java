package com.acc.dc.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/No-Auth")
public class NoAuthControlelr {
	@GetMapping("/get-No-Auth")
	public String getMsg() {
		return "From No Auth Controller class";
	}

}
