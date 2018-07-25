package com.example.meri.userslist.service;

import com.example.meri.userslist.user.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("/users")
    Call<List<User>> usersList();

    @GET("/users/{user}")
    Call<User> searchUser(@Path("user") String user);
}
