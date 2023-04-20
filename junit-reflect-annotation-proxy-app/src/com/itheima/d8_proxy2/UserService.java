package com.itheima.d8_proxy2;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUsers();
    String selectUser();

}
