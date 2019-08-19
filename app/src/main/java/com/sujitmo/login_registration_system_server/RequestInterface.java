package com.sujitmo.login_registration_system_server;

import com.sujitmo.login_registration_system_server.models.ServerRequest;
import com.sujitmo.login_registration_system_server.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("android-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
