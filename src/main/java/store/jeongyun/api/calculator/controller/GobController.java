package store.jeongyun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.jeongyun.api.calculator.service.GobService;
import store.jeongyun.api.calculator.domain.GobDTO;

@Controller
public class GobController {

    private final GobService gobService;
    public GobController(GobService gobService) {
        this.gobService = gobService;

    }
    @GetMapping("/contents/calculator/gob")
        public String gob(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            System.out.println("컨트롤러로 들어옴");
            System.out.println("화면에서 컨트롤러로 전달된 숫자 1: " + num1);
            System.out.println("화면에서 컨트롤러로 전달된 숫자 2: " + num2);
            GobDTO gobDTO = new GobDTO();
            gobDTO.setNum1(num1);
            gobDTO.setNum2(num2);
            gobService.gob(gobDTO);
            return "contents/calculator/gob"; // templates/login.html
        }
}
