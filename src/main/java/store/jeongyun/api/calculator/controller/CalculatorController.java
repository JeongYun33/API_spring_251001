package store.jeongyun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.jeongyun.api.calculator.service.CalculatorService;
import store.jeongyun.api.calculator.domain.CalculatorDTO;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping("/contents/calculator/calculator")
    public String calculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
            @RequestParam("operation") String operation) {
        System.out.println("계산기 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 숫자 1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 숫자 2: " + num2);
        CalculatorDTO calculatorDTO = new CalculatorDTO();
        calculatorDTO.setNum1(num1);
        calculatorDTO.setNum2(num2);
        calculatorDTO.setOperation(operation);

        int result = calculatorService.calculator(calculatorDTO);
        System.out.println("계산 결과: " + result);

        return "contents/calculator/calculator"; 
    }
}
