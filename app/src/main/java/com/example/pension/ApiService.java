package com.example.pension;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/home")
    Call<UserData> getData();
}
