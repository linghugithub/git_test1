package cn.ljp.ssm.web.controller;

import cn.ljp.ssm.dao.IAccountDao;
import cn.ljp.ssm.domain.Account;
import cn.ljp.ssm.service.IAccountService;
import cn.ljp.ssm.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by ljb  on 2020/5/1616:52
 * springMvc_test--AccountController
 * function
 * design
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {


    @Autowired
    private IAccountService accountService;

    @RequestMapping(path = "/findAll")
    public String findAll() {
        System.out.println("web层：方法执行....");
        System.out.println(accountService.findAll());
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account) {
        accountService.saveAccount(account);
        return "success";
    }

    @RequestMapping(path = "/transferMoney")
    public String transferMoney() {
        Account account = new Account();
        account.setId(1);
        Account account1 = new Account();
        account1.setId(2);
        accountService.transferMoney(account, account1);
        return "success";
    }

    @RequestMapping(path = "/findAccount")
    public String findAccount() {
//        Account account = new Account();
//        account.setId(1);
        System.out.println(accountService.findAccountById(1));
        return "success";
    }


}
