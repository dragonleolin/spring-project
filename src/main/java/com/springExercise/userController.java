package com.springExercise;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

//	@RequestMapping("/MyFirstPage")
//	public String greeting(@RequestParam(value = "title", required = false, defaultValue = "鐵人賽 加油!") String title,
//			Model model) {
//		model.addAttribute("name", title);
//		return "index";
//	}
	
	
	private String message = "鐵人賽第七天加油!!!";
	 
	 @GetMapping("/")
		public String index(Map<String, Object> model) {
			model.put("message", this.message);
			return "index";
		}
}