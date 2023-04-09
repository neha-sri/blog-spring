package com.springblog

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("page")
data class PageProperties(var title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}