package com.sashwat.java.O6_async;

import com.sashwat.kotlin.O6_async.model.Item;
import com.sashwat.kotlin.O6_async.model.Post;

public class SyncDemo {

    void runDemo(Item item) {
        String token = requestToken();
        Post post = createPost(token, item);
        processPost(post);
    }

    String requestToken() {
        // Make Service call
        return "";
    }

    Post createPost(String token, Item item) {
        // Make service call
        return null;
    }

    void processPost(Post post) {

    }
}
