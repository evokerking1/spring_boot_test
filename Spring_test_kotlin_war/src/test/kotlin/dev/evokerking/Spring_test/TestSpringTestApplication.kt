package dev.evokerking.Spring_test

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SpringTestApplication>().with(TestcontainersConfiguration::class).run(*args)
}
