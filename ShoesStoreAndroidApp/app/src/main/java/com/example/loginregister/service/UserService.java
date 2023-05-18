package com.example.loginregister.service;

import com.example.loginregister.model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {

    @POST("user")
    Call<User> addNewUser(@Body User user);
    @POST("/checkout/{username}")
    Call<ResponseBody> checkOut(@Path("username") String username);
}
