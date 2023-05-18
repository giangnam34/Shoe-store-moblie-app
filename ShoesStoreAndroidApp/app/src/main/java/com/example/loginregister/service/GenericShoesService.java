package com.example.loginregister.service;




import com.example.loginregister.model.Category;
import com.example.loginregister.model.GenericShoes;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GenericShoesService {
    String GENERIC_SHOES = "GenericShoes";

    @GET("product")
    Call<GenericShoes[]> getAllGenericShoes();

    @GET("productorder/{username}")
    Call<GenericShoes[]> getProductOrder(@Path("username") String username);

    @GET(GENERIC_SHOES + "/{id}")
    Call<GenericShoes> getAllGenericShoes(@Path("id") Object id);

    @GET("product/{name}")
    Call<GenericShoes[]> getAllGenericShoesByName(@Path("name") String name);

    @POST("product/{id}/{quantity}/user/{username}")
    Call<ResponseBody> addProductToCart(@Path("id") int id, @Path("quantity") int quantity, @Path("username") String username);

}
