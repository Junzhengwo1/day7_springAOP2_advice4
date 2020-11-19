package com.kou.service;

/**
 * 账户的业务接口
 * @author dell
 */
public interface IAccountService {

    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     */
    void updateAccount(Integer id);

    /**
     * 删除账户
     * @return
     */
    int deleteAccount();
}
