package org.demon.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.demon.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from t_account")
    List<Account> findAll();

    @Insert("insert into t_account(username, balance) values(#{username}, #{balance});")
    void addAccount(Account account);
}
