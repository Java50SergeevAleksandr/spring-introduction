package telran.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
	@GetMapping("add")
	double add(double op1, double op2) {
		return op1 + op2;
	}

	@GetMapping("substract")
	double substract(double op1, double op2) {
		return op1 - op2;
	}

	@GetMapping("multiply")
	double multiply(double op1, double op2) {
		return op1 * op2;
	}

	@GetMapping("divide")
	double divide(double op1, double op2) {
		return op1 / op2;
	}
}
