package com.example.singleactivityexample.domain

import com.example.singleactivityexample.model.Comment
import com.example.singleactivityexample.model.Post
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsApi {

    @GET(value = "posts")
    suspend fun getAllPosts(): List<Post>

    @GET(value = "posts/{id}")
    suspend fun getPostById(@Path("id") id: Long):Post

    @GET(value = "comments")
    suspend fun getCommentsByPostId(@Query("postId") id: Long): List<Comment>
}