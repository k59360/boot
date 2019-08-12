package com.xdclass.test.wiggin;

public class Test {
    public static final String Msg = "123  ";

    public static void main(String[] args) {



        User user = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
    }

    public static XdClassUser convert(User user){
        XdClassUser xdClassUser = new XdClassUser();
        xdClassUser.setName(user.getName());
        xdClassUser.setSex(user.getSex());
        xdClassUser.setBirth(user.getBirth());
        xdClassUser.setAge(user.getAge());
        return xdClassUser;

    }
}
