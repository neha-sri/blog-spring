package com.springblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(PageProperties::class)
class GhServiceApplication

fun main(args: Array<String>) {
	runApplication<GhServiceApplication>(*args)
}
