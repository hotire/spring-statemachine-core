package com.github.hotire.spring.statemachine.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.statemachine.config.EnableStateMachine

@EnableStateMachine
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
