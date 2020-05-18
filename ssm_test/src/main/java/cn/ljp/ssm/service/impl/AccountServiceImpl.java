package cn.ljp.ssm.service.impl;

import cn.ljp.ssm.dao.IAccountDao;
import cn.ljp.ssm.domain.Account;
import cn.ljp.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by ljb  on 2020/5/1616:34
 * springMvc_test--AccountServiceImpl
 * function
 * design
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    @Override
    public List<Account> findAll() {
        System.out.println("业务层：AccountServiceImpl方法执行");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.insertAccount(account);
        throw new RuntimeException("保存账户异常");
    }

    @Override
    public void transferMoney(Account accountFrom, Account accountTo) {
        accountDao.updateMoneyById(accountFrom.getId(), -100);
//        int a = 10 / 0;
        accountDao.updateMoneyById(accountTo.getId(), 100);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.queryAccountById(id);
    }
}
