package com.example.bottomnavigationdemo.ApiResponse.SubjectBook;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SubjectApi {
    @GET("/subjects/love.json")
    Call<Subject> getLoveSubjects(@Query("limit") int limit);
}

