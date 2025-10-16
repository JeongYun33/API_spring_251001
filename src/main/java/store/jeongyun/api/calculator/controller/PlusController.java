package store.jeongyun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.jeongyun.api.calculator.service.PlusService;
import store.jeongyun.api.calculator.domain.PlusDTO;

@Controller
public class PlusController {

    private final PlusService plusService;
    public PlusController(PlusService plusService) {
        this.plusService = plusService;

    }
    @GetMapping("/contents/calculator/plus")
        public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            System.out.println("컨트롤러로 들어옴");
            System.out.println("화면에서 컨트롤러로 전달된 숫자 1: " + num1);
            System.out.println("화면에서 컨트롤러로 전달된 숫자 2: " + num2);
            PlusDTO plusDTO = new PlusDTO();
            plusDTO.setNum1(num1);
            plusDTO.setNum2(num2);
            plusService.plus(plusDTO);
            return "contents/calculator/plus"; // templates/login.html
        }
}