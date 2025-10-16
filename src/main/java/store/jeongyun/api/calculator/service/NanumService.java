package store.jeongyun.api.calculator.service;
import org.springframework.stereotype.Service;
import store.jeongyun.api.calculator.domain.NanumDTO;

@Service
public class NanumService {

    public boolean nanum(NanumDTO nanumDTO){
        System.out.println("나눗셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자 1: " + nanumDTO.getNum1());
        System.out.println("서비스로 전달된 숫자 2: " + nanumDTO.getNum2());
        return true;
    }
}
