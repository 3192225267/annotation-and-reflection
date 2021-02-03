package com.lzh.reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        User user = new User();
        Class aClass = Class.forName("com.lzh.reflection.User");
        User u = (User)aClass.newInstance();
        u.setAge("108");
        System.out.println(u.getAge());
    }
}

class User{
    private String userName;
    private String userPwd;
    private String age;
    private Integer userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", age='" + age + '\'' +
                ", userId=" + userId +
                '}';
    }

    public User(String userName, String userPwd, String age, Integer userId) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.age = age;
        this.userId = userId;
    }

    public User() {
    }
}