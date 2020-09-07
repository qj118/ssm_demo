package org.demon.service.impl;

import org.demon.dao.AccountDao;
import org.demon.domain.Account;
import org.demon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有用户 ...");
        return accountDao.findAll();
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("业务层：新建账户 ...");
        accountDao.addAccount(account);
    }
}
