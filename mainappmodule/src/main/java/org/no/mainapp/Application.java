package org.no.mainapp;

import java.util.HashMap;
import java.util.Map;

import org.no.dao.Dao;
import org.no.entity.User;
import org.no.userdao.UserDao;

public class Application {
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao<User> userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    } 
}
