package store.jeongyun.api.calculator.service;
import org.springframework.stereotype.Service;
import store.jeongyun.api.calculator.domain.GobDTO;

@Service
public class GobService {

    public boolean gob(GobDTO gobDTO){
        System.out.println("곱셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자 1: " + gobDTO.getNum1());
        System.out.println("서비스로 전달된 숫자 2: " + gobDTO.getNum2());
        return true;
    }
}
