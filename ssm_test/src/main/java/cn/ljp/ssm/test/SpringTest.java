package cn.ljp.ssm.test;

import cn.ljp.ssm.config.App;
import cn.ljp.ssm.service.IAccountService;
import org.junit.Test;

/**
 * create by ljb  on 2020/5/1616:35
 * springMvc_test--SpringTest
 * function
 * design
 */
public class SpringTest {

    @Test
    public void test() {
        IAccountService accountDao = (IAccountService) App.getContext().getBean("accountServiceImpl");
        accountDao.findAll();
    }

}
