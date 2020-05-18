package cn.ljp.ssm.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by ljb  on 2020/5/1219:14
 * spring_test--App
 * function
 * design
 */
public class App {
    private static ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    /**
     * 获取ioc容器
     * @return
     */
    public static ApplicationContext getContext() {
        return context;
    }
}
