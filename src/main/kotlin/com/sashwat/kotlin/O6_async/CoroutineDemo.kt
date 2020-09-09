package com.sashwat.kotlin.O6_async

import com.sashwat.kotlin.O6_async.model.Item
import com.sashwat.kotlin.O6_async.model.Post

class CoroutineDemo {

    suspend fun runDemo(item: Item) {
        val token = requestToken()
        val post = createPost(token, item)

        processPost(post)
    }

    suspend fun requestToken(): String {
        return ""
    }

    suspend fun createPost(token: String, item: Item): Post {
        return Post("")
    }

    fun processPost(post: Post) {

    }
}