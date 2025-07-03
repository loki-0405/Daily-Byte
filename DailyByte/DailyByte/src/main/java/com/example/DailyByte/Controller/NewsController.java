package com.example.DailyByte.Controller;

import com.example.DailyByte.Models.Article;
import com.example.DailyByte.Service.EmailService;
import com.example.DailyByte.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")
    public ResponseEntity<String> sendNews() {
        List<Article> articles = newsService.getTechNews();
        String html = newsService.formatNewsAsHtml(articles);

        emailService.sendNewsEmail("22l31a1235@gmail.com", "📰 Tech News - " + LocalDate.now(), html);

        return ResponseEntity.ok("Email sent to " + "22l31a1235@gmail.com");
    }

    @GetMapping("/test-email")
    public String testEmail() {
        emailService.sendNewsEmail("22l31a1235@gmail.com", "Test Email", "<b>Hello from Spring Boot</b>");
        return "Test email sent";
    }

}
