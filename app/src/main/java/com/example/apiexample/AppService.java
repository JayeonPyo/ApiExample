package com.example.apiexample;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AppService {

    @GET("/student/{path}")
    public Call<ResponseBody> getData(
            @Path("path") int number
    );

    @FormUrlEncoded
    @POST("/student")
    public Call<ResponseBody> setData(
            @Field("number") int number,
            @Field("name") String name
    );

}
