package web.javaproject.fooddeliveryapp.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* web.javaproject.fooddeliveryapp.service..*(..))")
    public void logBeforeServiceMethods() {
        logger.info("A method in the service layer was called");
    }
}
