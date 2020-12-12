package cn.dwxu.demo.exception;

import cn.dwxu.demo.service.InstanceService;
import org.springframework.stereotype.Component;

/**
 * @Author xudongwu
 * @Date 2020/12/12
 * @Description
 */
@Component
public class InstanceServiceFallback implements InstanceService {

    @Override
    public String info() {
        return "Fallback: Hello world.";
    }
}
