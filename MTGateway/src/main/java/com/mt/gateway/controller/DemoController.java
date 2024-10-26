package com.mt.gateway.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mtgateway")
public class DemoController {
	
	@GetMapping("/demo")
	public String demo(OAuth2AuthenticationToken token) {
		System.out.println("hey  "+token.getPrincipal().getAttribute("name")+"--"+token.getPrincipal().getAttribute("email"));
		return "demo success";
	}
}
