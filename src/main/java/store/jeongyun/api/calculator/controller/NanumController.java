package store.jeongyun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.jeongyun.api.calculator.service.NanumService;
import store.jeongyun.api.calculator.domain.NanumDTO;

@Controller
public class NanumController {

    private final NanumService nanumService;
    public NanumController(NanumService nanumService) {
        this.nanumService = nanumService;

    }
    @GetMapping("/contents/calculator/nanum")
        public String nanum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            System.out.println("컨트롤러로 들어옴");
            System.out.println("화면에서 컨트롤러로 전달된 숫자 1: " + num1);
            System.out.println("화면에서 컨트롤러로 전달된 숫자 2: " + num2);
            NanumDTO nanumDTO = new NanumDTO();
            nanumDTO.setNum1(num1);
            nanumDTO.setNum2(num2);
            nanumService.nanum(nanumDTO);
            return "contents/calculator/nanum"; // templates/login.html
        }
}