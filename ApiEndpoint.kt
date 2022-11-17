package com.themovie.androidretrofit.retrofit;


import com.themovie.androidretrofit.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("data.php") Call<MainModel> getData();
}
