package com.springblog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PageConfiguration {
    @Bean
    fun databaseInitializer(
        userRepository: AuthorRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val johnDoe = userRepository.save(
            Author(
                description = "Random",
                login = "johnDoe",
                firstname = "John",
                lastname = "Doe",
                id = 123L
            )
        )

        articleRepository.save(
            Article(
                title = "Lorem",
                headline = "Lorem",
                content = "dolor sit amet",
                author = johnDoe
            )
        )

        articleRepository.save(
            Article(
                title = "Ipsum",
                headline = "Ipsum",
                content = "dolor sit amet",
                author = johnDoe
            )
        )
    }
}