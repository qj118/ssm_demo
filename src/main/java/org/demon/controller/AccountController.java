package org.demon.controller;

import org.demon.domain.Account;
import org.demon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String testFindAll(Model model){
        System.out.println("表现层：查询所有用户 ...");
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String testSave(Account account){
        accountService.addAccount(account);
        return "redirect:/account/findAll";
    }
}
