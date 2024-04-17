package com.cache.api.dao;

public class AccountDAO {

    private static final String TAG = "AccountDAO";

    public static Boolean add(String account, String password) {
        System.out.println("[AccountDAO] Add to DataBase, account: " + account + ", password: " + password);
        return true;
    }
}