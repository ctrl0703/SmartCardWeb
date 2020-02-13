package io.cahlee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.cahlee.client.SmartCardClient;

@Controller
public class WebController {
	@Autowired
	SmartCardClient smartCardClient;
	
	@GetMapping("/")
	public String smartcards(Model model) {
		model.addAttribute("smartcardList", smartCardClient.smartCardList());
		return "smartcards";
	}
	
	@GetMapping("/smartcard/words")
	public String smartcard(@RequestParam Long id, Model model) {
		model.addAttribute("smartcard", smartCardClient.smartCard(id));
		return "smartcard";
	}
}
