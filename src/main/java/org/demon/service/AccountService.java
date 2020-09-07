package org.demon.service;

import org.demon.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void addAccount(Account account);
}
