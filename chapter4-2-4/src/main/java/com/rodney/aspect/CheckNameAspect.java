package com.rodney.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(10)
@Component
public class CheckNameAspect {

    private Logger logger = LogManager.getLogger(CheckNameAspect.class);


    @Pointcut("execution(public * com.rodney.web..*.*(..))")
    public void webLog(){}


    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {

        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }
}
