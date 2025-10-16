package store.jeongyun.api.calculator.service;
import org.springframework.stereotype.Service;
import store.jeongyun.api.calculator.domain.MinusDTO;

@Service
public class MinusService {

    public boolean minus(MinusDTO minusDTO){
        System.out.println("마이너스 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자 1: " + minusDTO.getNum1());
        System.out.println("서비스로 전달된 숫자 2: " + minusDTO.getNum2());
        return true;
    }
}