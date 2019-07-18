package exam3.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class InsertAop {

    /**
     * 切入点
     */
    @Pointcut("execution(public * exam3.controller.*Controller.*(..))")
    public void log() {

    }

    /**
     * 前置操作
     *
     * @param point 切入点
     */
    @Before("log()")
    public void beforeLog(JoinPoint point) {
        log.info("BeforeInsertFilmData");
    }

    @AfterReturning("log()")
    public void afterLog(JoinPoint point){
        log.info("AfterInsertFilmData");
    }

}
