package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Fortune {
	@RequestMapping
	public String start() {
		double fn = Math.random();
		if (fn >= 0.7) {
			return "greatFortune.html";
		}   else if (fn >= 0.4) {
			return "middleFortune.html";
		}   else if (fn >= 0.1) {
			return "smallFortune.html";
		}   else {
			return "misFortune.html";
		}
		
	}

}