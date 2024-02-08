package com.sanie.creational.builder;

import java.util.List;
import java.util.Map;

public class UserProfile {
    private String name;
    private String username;
    private String email;
    private List<String> friends;
    private List<String> recentPosts;
    private Map<String, Boolean> settings;

    // Constructor made protected to be only used by the builder
    protected UserProfile(UserProfileBuilder builder) {
        this.name = builder.name;
        this.username = builder.username;
        this.email = builder.email;
        this.friends = builder.friends;
        this.recentPosts = builder.recentPosts;
        this.settings = builder.settings;
    }

}
