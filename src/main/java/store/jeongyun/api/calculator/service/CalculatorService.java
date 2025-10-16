package store.jeongyun.api.calculator.service;

import org.springframework.stereotype.Service;

import store.jeongyun.api.calculator.domain.CalculatorDTO;

@Service
public class CalculatorService {
    public int calculator(CalculatorDTO calculatorDTO) {
        int num1 = calculatorDTO.getNum1();
        int num2 = calculatorDTO.getNum2();
        String operation = calculatorDTO.getOperation();

        int result = 0;

        if (operation.equals("plus")) {
            result = num1 + num2;
            System.out.println("덧셈 결과: " + result);
        } else if (operation.equals("minus")) {
            result = num1 - num2;
            System.out.println("뺄셈 결과: " + result);
        } else if (operation.equals("gob")) {
            result = num1 * num2;
            System.out.println("곱셈 결과: " + result);
        } else if (operation.equals("nanum")) {
            result = num1 / num2;
            System.out.println("나눗셈 결과: " + result);
        } else {
            System.out.println("잘못된 연산입니다.");
        }
        return result;
    }
}
