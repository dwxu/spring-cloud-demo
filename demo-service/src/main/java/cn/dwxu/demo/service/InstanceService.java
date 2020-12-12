package cn.dwxu.demo.service;

import cn.dwxu.demo.exception.InstanceServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xudongwu
 * @Date 2020/12/12
 * @Description
 */
@FeignClient(name = "instance-service", fallbackFactory = InstanceServiceFallbackFactory.class)
public interface InstanceService {

    @RequestMapping("/info")
    String info();
}
