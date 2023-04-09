package com.springblog

import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface AuthorRepository : CrudRepository<Author, Long> {
    fun findByLogin(login: String): Author?
}