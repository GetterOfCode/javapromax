package com.itheima.d8_proxy2;

public class UserServiceImpl implements UserService{

    @Override
    public String login(String loginName, String passWord) {

        String rs = "登录名和密码错误";
        if("admin".equals(loginName)&&"123456".equals(passWord)){
            rs = "登陆成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return rs;
    }

    @Override
    public void deleteUsers() {
        try {
            System.out.println("您正在删除用户数据中~~~");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    @Override
    public String selectUser() {

        String rs = "查询了1000个用户";

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
