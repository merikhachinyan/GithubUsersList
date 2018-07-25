package com.example.meri.userslist.user;

import java.io.Serializable;

public class User implements Serializable{

    private String login;
    private String name;

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }
}
