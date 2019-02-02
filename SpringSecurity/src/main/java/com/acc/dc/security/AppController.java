package com.acc.dc.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DC/auth")
public class AppController {

	@GetMapping("/getMsg")
	public String getMsg() {
		return "Good Afternoon";
	}

}
