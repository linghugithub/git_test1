package cn.ljp.ssm.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * create by ljb  on 2020/5/138:32
 * spring_test--LogUtils
 * function  作为aoc切入的类
 * design
 */
@Component //say：一定要注册进去ioc容器里边 不可少
@Aspect  //say：表名当前类是切面类
public class LogUtils {
    //say：完整写法：
    //say：修饰符 返回值类型(可不写) 包名.类名.方法名（参数列表）
    @Pointcut("execution(* com.ljp.service.impl.AccountServiceImpl.*(..))")
    private void pt1() {}

    @Around("pt1()")  //say：注册环绕环绕通知  写法固定
    public Object  aroundVerify(ProceedingJoinPoint pjp) {  //say：切入点进程
        Object returnValue = null;
        try {
            Object[] args = pjp.getArgs();//得到方法执行所需的参数
            //say：切入点前
            System.out.println("账户安全已验证....");
            returnValue = pjp.proceed(args);
            //say：切入点后
            System.out.println("账户操作完毕,请取回卡片....");
            return returnValue;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return returnValue;
    }
}
