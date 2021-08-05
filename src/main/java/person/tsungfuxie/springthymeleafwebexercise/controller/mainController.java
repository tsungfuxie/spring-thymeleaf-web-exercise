package person.tsungfuxie.springthymeleafwebexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
	
	@GetMapping("/testjs")
	public String testjs(Model model) {
		model.addAttribute("name", "Robin");
		return "testjs";
	}

}
