package store.jeongyun.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}

	@GetMapping("/calculator.html")
	public String showCalculatorPage() {
		return "calculator";
	}
}


