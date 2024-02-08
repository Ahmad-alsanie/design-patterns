package com.sanie.creational.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserProfileBuilder {
    String name;
    String username;
    String email;
    List<String> friends = new ArrayList<>();
    List<String> recentPosts = new ArrayList<>();
    Map<String, Boolean> settings = new HashMap<>();

    public UserProfileBuilder(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public UserProfileBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserProfileBuilder friends(List<String> friends) {
        this.friends = friends;
        return this;
    }

    public UserProfileBuilder recentPosts(List<String> recentPosts) {
        this.recentPosts = recentPosts;
        return this;
    }

    public UserProfileBuilder settings(Map<String, Boolean> settings) {
        this.settings = settings;
        return this;
    }

    public UserProfile build() {
        return new UserProfile(this);
    }
}
