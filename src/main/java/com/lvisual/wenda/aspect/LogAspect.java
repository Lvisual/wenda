package com.lvisual.wenda.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;
import java.util.logging.Logger;

@Aspect
@Component
public class LogAspect {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.lvisual.wenda.controller.IndexController.*(..))")
    public void beforeMethod(){
        logger.info("before method");
    }
    @After("execution(* com.lvisual.wenda.controller.IndexController.*(..))")
    public void afterMethod(){
        logger.info("after method");
    }

}
