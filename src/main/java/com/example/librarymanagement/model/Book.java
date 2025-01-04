package com.example.librarymanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("Book")
public class Book implements Serializable {
    @Id
    private String id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;
} 