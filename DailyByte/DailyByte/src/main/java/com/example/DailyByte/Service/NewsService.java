package com.example.DailyByte.Service;

import com.example.DailyByte.Models.Article;
import com.example.DailyByte.Models.NewsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsService {

    @Value("${news.api.url}")
    private String baseUrl;

    @Value("${news.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Article> getTechNews() {
        String url = baseUrl + apiKey;
        NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
        return response != null ? response.getArticles() : List.of();
    }

    public String formatNewsAsHtml(List<Article> articles) {
        StringBuilder sb = new StringBuilder("<h2>\uD83D\uDCF0 Today's Tech News</h2><ul>");
        for (Article a : articles) {
            sb.append("<li><b>").append(a.getTitle()).append("</b><br/>")
                    .append(a.getDescription() != null ? a.getDescription() : "")
                    .append("<br/><a href=\"").append(a.getUrl()).append("\">Read more</a></li><br/>");
        }
        sb.append("</ul>");
        return sb.toString();
    }
}
