package com.instacats.demo.entity;

import java.time.LocalDateTime;
import java.util.*;

public class Post {
    private Long id;
    private String title;
    private String caption;
    private String location;
    private Integer likes;

    private Set<String> likedUsers = new HashSet<>();
    private User user;
    private List<Comment> comments = new ArrayList<>();
    private LocalDateTime createdDate;

    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}