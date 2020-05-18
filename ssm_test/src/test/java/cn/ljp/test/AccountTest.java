package cn.ljp.test;

import cn.ljp.ssm.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by ljb  on 2020/5/1712:06
 * springMvc_test--ServiceTest
 * function
 * design
 */
@RunWith(SpringJUnit4ClassRunner.class) //say：配置spring ioc容器在junit中运行环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")  //say：加载配置文件，初始化容器
public class AccountTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testFindAll() {
        System.out.println(accountService.findAll());
    }

}
