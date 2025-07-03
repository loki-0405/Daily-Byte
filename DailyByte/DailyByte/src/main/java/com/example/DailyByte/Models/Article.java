package com.example.DailyByte.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    private String title;
    private String description;
    private String url;
    private String publishedAt;

}
