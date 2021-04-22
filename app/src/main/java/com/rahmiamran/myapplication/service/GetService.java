package com.rahmiamran.myapplication.service;

import com.rahmiamran.myapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}

