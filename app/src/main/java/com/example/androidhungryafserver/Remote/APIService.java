package com.example.androidhungryafserver.Remote;

import com.example.androidhungryafserver.Model.MyResponse;
import com.example.androidhungryafserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-type:application/json",
            "Authorization:key=AAAAloO6t2w:APA91bE5gkvygJ3Kkqc3bFPT0vx8FEJ7w7iLOHjaBagvjv1bjmuxwTVna08ST_92M1ifjLWW8ezpU-JAl2Lrz2apnJ_lnhJKvDY4MGoLD2lDxUFaICIQ6rMRj5cwSuNs3174hnLu8kAd"
    })


    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}