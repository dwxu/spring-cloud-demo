package cn.dwxu.demo.exception;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author xudongwu
 * @Date 2020/12/12
 * @Description
 */
@Component
public class InstanceServiceFallbackFactory implements FallbackFactory<InstanceServiceFallback> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceServiceFallbackFactory.class);

    private final InstanceServiceFallback instanceServiceFallback;

    public InstanceServiceFallbackFactory(InstanceServiceFallback instanceServiceFallback) {
        this.instanceServiceFallback = instanceServiceFallback;
    }

    @Override
    public InstanceServiceFallback create(Throwable throwable) {
        if (throwable != null && throwable.getCause() != null) {
            LOGGER.error("Failed to call remote service.", throwable);
        }
        return instanceServiceFallback;
    }
}
