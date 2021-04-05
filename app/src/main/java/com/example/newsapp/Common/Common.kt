package com.example.newsfeedapp.Common

import com.example.newsfeedapp.Interface.NewsService
import com.example.newsfeedapp.Remote.RetrofitClient
import java.lang.StringBuilder

object Common {
    val BASE_URL="https://newsapi.org/";
    val API_KEY="0efc20295726490eab55baee42025686"


    val newsService:NewsService
    get() = RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)


    }
