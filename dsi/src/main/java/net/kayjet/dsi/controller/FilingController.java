package net.kayjet.dsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filing")
public class FilingController {

	@RequestMapping("/index")
	@ResponseBody
	public String filingHome() {
		return "filingHome";
	}

}
