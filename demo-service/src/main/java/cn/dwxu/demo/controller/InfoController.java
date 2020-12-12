package cn.dwxu.demo.controller;

import cn.dwxu.demo.service.InstanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class InfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @Autowired
    private InstanceService instanceService;

    @RequestMapping("/info")
    public String info() {
        Date date = new Date();
        LOGGER.info(date.toString());
        return "Hello world.";
    }

    @RequestMapping("/info/instance")
    public String getInstanceInfo() {
        Date date = new Date();
        LOGGER.info(date.toString());
        return instanceService.info();
    }
}
