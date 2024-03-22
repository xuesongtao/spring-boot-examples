package com.example.logbackdemo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfh
 * @version 1.0
 * @since 2019/12/6 15:20
 */
@RestController
@RequestMapping(value = "log")
public class IndexAction {

    private Logger logger = LoggerFactory.getLogger(IndexAction.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping(value = "")
    public String testLoggerTag() {
        logger.info("header: {}", request.getHeader("trace-id"));
        logger.debug("测试logger标签");
        logger.info("测试logger标签");
        logger.warn("测试logger标签");
        logger.error("测试logger标签");
        return "this is spring-boot-logback-demo projects.";
    }
}
