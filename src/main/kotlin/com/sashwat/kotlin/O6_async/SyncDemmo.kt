package com.sashwat.kotlin.O6_async

import com.sashwat.kotlin.O6_async.model.Item
import com.sashwat.kotlin.O6_async.model.Post

class SyncDemo {

    fun runDemo(item: Item) {
        val token = requestToken()
        val post = createPost(item)

        processPost(post)
    }

    private fun requestToken(): String {
        return ""
    }

    private fun createPost(item: Item): Post {
        return Post("")
    }

    private fun processPost(post: Post) {

    }
}