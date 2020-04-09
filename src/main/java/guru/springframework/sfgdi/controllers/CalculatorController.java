package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

	@RequestMapping("/add")
	public int add(int a, int b) {
		return a + b;
	}
	
	@RequestMapping("/substract")
	public int minus(int a, int b) {
		return a - b;
	}
	
	@RequestMapping("/multiply")
	public int mul(int a, int b) {
		return a * b;
	}
	
	@RequestMapping("/devide")
	public int devide(int a, int b) {
		return a / b;
	}
}
