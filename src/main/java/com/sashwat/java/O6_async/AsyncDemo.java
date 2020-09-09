package com.sashwat.java.O6_async;

import com.sashwat.kotlin.O6_async.model.Item;
import com.sashwat.kotlin.O6_async.model.Post;

import java.util.concurrent.CompletableFuture;

public class AsyncDemo {

    CompletableFuture<Void> runDemo(Item item) {
        return requestToken()
                .thenCompose(token -> createPost(token, item))
                .thenAccept(post -> processPost(post));
    }

    CompletableFuture<String> requestToken() {
        return CompletableFuture.supplyAsync(() -> "");
    }

    CompletableFuture<Post> createPost(String token, Item item) {
        return CompletableFuture.supplyAsync(() -> new Post(""));
    }

    CompletableFuture<Void> processPost(Post post) {
        return CompletableFuture.runAsync(() -> {});
    }

}
