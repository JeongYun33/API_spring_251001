package store.jeongyun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.jeongyun.api.calculator.service.MinusService;
import store.jeongyun.api.calculator.domain.MinusDTO;

@Controller
public class MinusController {

    private final MinusService minusService;
    public MinusController(MinusService minusService) {
        this.minusService = minusService;

    }
    @GetMapping("/contents/calculator/minus")
        public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            System.out.println("컨트롤러로 들어옴");
            System.out.println("화면에서 컨트롤러로 전달된 숫자 1: " + num1);
            System.out.println("화면에서 컨트롤러로 전달된 숫자 2: " + num2);
            MinusDTO minusDTO = new MinusDTO();
            minusDTO.setNum1(num1);
            minusDTO.setNum2(num2);
            minusService.minus(minusDTO);
            return "contents/calculator/minus"; // templates/login.html
        }
}

