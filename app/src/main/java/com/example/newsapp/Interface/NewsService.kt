package com.example.newsfeedapp.Interface


import com.example.newsfeedapp.Model.WebSite
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {
    @get:GET("v2/sources?apiKey=0efc20295726490eab55baee42025686")
    val sources : Call<WebSite>
}
