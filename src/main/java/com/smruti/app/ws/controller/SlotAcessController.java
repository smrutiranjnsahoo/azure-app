package com.smruti.app.ws.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("slottest")
public class SlotAcessController {
	
	@Value("${name.value}")
	private String nameValue;
	
	
	@GetMapping("/getName")
	public String getSlots() {

		return "Hello : "+nameValue;
	}

}
