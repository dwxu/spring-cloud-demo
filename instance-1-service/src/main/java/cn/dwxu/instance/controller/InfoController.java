package cn.dwxu.instance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class InfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @RequestMapping("/info")
    public String info() {
        Date date = new Date();
        LOGGER.info(date.toString());
        return "Hello world.";
    }
}
