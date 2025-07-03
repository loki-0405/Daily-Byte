# Daily-Byte

# 📰 DailyByte News API

**DailyByte** is a modern Spring Boot service that fetches the latest technology news from [NewsAPI](https://newsapi.org) and delivers it straight to your inbox. It's a great utility for developers, tech enthusiasts, or teams that want to stay up-to-date automatically, every morning.

---

## 🚀 Features

- ✅ Fetches top tech news using NewsAPI
- ✅ Sends beautiful HTML-formatted news emails daily
- ✅ REST endpoint to trigger email manually
- ✅ Uses `RestTemplate`, `JavaMailSender`, and `@Scheduled`
- ✅ Built with modern Java (17+) and Spring Boot 3

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- RestTemplate
- JavaMailSender
- Scheduled Tasks (`@Scheduled`)
- Maven

---

## 📦 API Endpoints

| Method | Endpoint                   |   Description                          |
|--------|----------------------------|----------------------------------------|
| GET    | `/api/news/send            | Sends news email to a specific address |
| GET    | `/test-email` _(optional)_ | Sends a test email                     |

---

## ⚙️ Configuration

Update the following in `application.properties`:

```properties
# Email Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# News API
news.api.key=YOUR_NEWS_API_KEY
news.api.url=https://newsapi.org/v2/top-headlines?category=technology&language=en&apiKey=
