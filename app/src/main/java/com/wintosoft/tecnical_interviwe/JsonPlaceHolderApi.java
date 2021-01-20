package com.wintosoft.tecnical_interviwe;

import com.wintosoft.tecnical_interviwe.Models.LiceneDetails;
import com.wintosoft.tecnical_interviwe.Models.UserDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("2")
    Call<UserDetails> getUserDetails();


//    @GET("")
//    Call<List<UserDetails>> getUserDetails(@Query("page") int id);

    @GET("/user/2")
    Call<List<LiceneDetails>> getLiceneDetails();

}
