package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start endpoint
 *@return
 *test
 */
@Controller
public class PlantPlacesController {
	
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
	}

	/**
	 * @author Administrator
	 *Handle the /index endpoint
	 *@return
	 *test
	 */
	@RequestMapping("/")
	public String Index(){
		
		return "start";
	}
}
