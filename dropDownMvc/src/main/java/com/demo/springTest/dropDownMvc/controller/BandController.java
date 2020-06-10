package com.demo.springTest.dropDownMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bands")
public class BandController {
	
	@RequestMapping("/showBands")
	public String showBands(Model theModel) {
		
		Bands theBand=new Bands();
		
		theModel.addAttribute("band", theBand);
		
		return "band-list";
		
	}
	
	@RequestMapping("/bandList")
	public String bandList(@ModelAttribute("band") Bands theBand) {
		
		if(theBand.getBands().equals("Cold Play")) {
			return "Coldplay-list";
		}
		else {
			return "BackStreet-Boys";
			
		}
				
		
	}

}
