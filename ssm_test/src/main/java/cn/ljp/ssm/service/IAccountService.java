package cn.ljp.ssm.service;

import cn.ljp.ssm.domain.Account;
import cn.ljp.ssm.web.controller.AccountController;

import java.util.List;

/**
 * create by ljb  on 2020/5/1616:21
 * springMvc_test--IAccountDao
 * function
 * design
 */
public interface IAccountService {

    /**
     * 查询全部
     * @return
     */
    List<Account> findAll();


    /**
     * 保存一个账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 转账
     * @param accountFrom
     * @param accountTo
     */
    void transferMoney(Account accountFrom, Account accountTo);


    /***
     * 通过id查询账户
     * @param id
     * @return
     */
    Account findAccountById(int id);
}
