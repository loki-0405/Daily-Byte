package com.example.DailyByte.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsResponse {
    private String status;
    private int totalResults;
    private List<Article> articles;

}
