package com.dailycodebuffer.reactiveprogramming.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {
    private long bookId;
    private String title;
    private String author;
    private String ISBN;
}
