package com.itheima.d8_proxy2;

public class Test {
    public static void main(String[] args) {
        UserService user = new UserServiceImpl();
      /*  user.deleteUsers();
        user.login("admin","123456");
        user.selectUser();*/

        UserService proxy = UserServiceProxy.getProxy(user);
        proxy.deleteUsers();
        proxy.login("admin","123456");
        proxy.selectUser();
    }
}
