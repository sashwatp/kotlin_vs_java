package com.sashwat.kotlin.O6_async

import com.sashwat.kotlin.O6_async.model.Item
import com.sashwat.kotlin.O6_async.model.Post

class SyncDemmo {

    fun runDemo(item: Item) {
        val token = requestToken()
        val post = createPost(item)

        processPost(post)
    }

    fun requestToken(): String {
        return ""
    }

    fun createPost(item: Item): Post {
        return Post("")
    }

    fun processPost(post: Post) {

    }
}